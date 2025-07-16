document.addEventListener('DOMContentLoaded', () => {
    // Game state variables
    const playerScores = [0, 0, 0, 0];                  // Scores for Player 1 to 4
    const playerLastRolls = [null, null, null, null];   // Last roll for each player
    let currentRound = 1;
    const maxRounds = 5;
    let isRolling = false;                              // To prevent multiple clicks during animation

    // References to HTML elements
    const scoreElements = document.querySelectorAll('.score');
    const lastRollElements = document.querySelectorAll('.last-roll');
    const dieElements = document.querySelectorAll('.die'); // All individual dice displays
    const rollDiceBtn = document.getElementById('rollDiceBtn');
    const currentRoundSpan = document.getElementById('currentRound');
    const gameMessage = document.getElementById('gameMessage');
    const resetGameBtn = document.getElementById('resetGameBtn');

    /**
     * Simulates a single die roll (1-6).
     * @returns {number} The random number rolled.
     */
    function rollDie() {
        return Math.floor(Math.random() * 6) + 1;
    }

    /**
     * Updates the displayed scores and last rolls for all players.
     */
    function updatePlayerDisplay() {
        playerScores.forEach((score, index) => {
            scoreElements[index].textContent = score;
            lastRollElements[index].textContent = playerLastRolls[index] !== null ? playerLastRolls[index] : '';
        });
    }

    /**
     * Animates the dice rolling and then displays the result.
     * @param {number} playerIndex The 0-based index of the player.
     * @param {number} rollValue The value to display after rolling.
     */
    function animateAndShowDie(playerIndex, rollValue) {
        const die = dieElements[playerIndex];
        die.textContent = ''; // Clear previous number
        die.classList.add('rolling'); // Start animation

        // After a short delay, stop animation and show result
        setTimeout(() => {
            die.classList.remove('rolling');
            die.textContent = rollValue;
        }, 800); // Animation duration is 0.3s * 3 iterations = 0.9s, so 0.8s is good for displaying
    }

    /**
     * Checks if the game has ended and determines the winner.
     */
    function checkGameEnd() {
        if (currentRound > maxRounds) {
            rollDiceBtn.disabled = true;
            rollDiceBtn.style.display = 'none';
            resetGameBtn.style.display = 'block';
            determineWinner();
        } else {
            currentRoundSpan.textContent = currentRound;
        }
    }

    /**
     * Determines the winner(s) based on final scores and displays the message.
     */
    function determineWinner() {
        let maxScore = -1;
        let winners = [];

        playerScores.forEach((score, index) => {
            if (score > maxScore) {
                maxScore = score;
                winners = [index + 1]; // New highest score, reset winners
            } else if (score === maxScore) {
                winners.push(index + 1); // Tie, add to winners
            }
        });

        if (winners.length === 1) {
            gameMessage.textContent = `🎉 Player ${winners[0]} wins with a grand total of ${maxScore} points!`;
        } else {
            gameMessage.textContent = `🤝 It's a tie! Players ${winners.join(' and ')} share the victory with ${maxScore} points!`;
        }
    }

    /**
     * Resets the game to its initial state.
     */
    function resetGame() {
        playerScores.fill(0);
        playerLastRolls.fill(null);
        currentRound = 1;
        gameMessage.textContent = '';
        rollDiceBtn.disabled = false;
        rollDiceBtn.style.display = 'block';
        resetGameBtn.style.display = 'none';

        // Clear dice displays
        dieElements.forEach(die => {
            die.textContent = '';
        });

        updatePlayerDisplay();
        currentRoundSpan.textContent = currentRound;
        isRolling = false; // Ensure rolling state is reset
    }

    // Event listener for the "Roll Dice" button
    rollDiceBtn.addEventListener('click', () => {
        if (isRolling || currentRound > maxRounds) {
            return; // Prevent multiple rolls or rolling after game ends
        }

        isRolling = true; // Set rolling state
        gameMessage.textContent = 'Rolling... Good luck!'; // Indicate rolling

        // First, trigger animations for all dice
        for (let i = 0; i < playerScores.length; i++) {
            dieElements[i].classList.add('rolling');
            dieElements[i].textContent = ''; // Clear number during animation
        }

        // Delay the actual score update and number display to sync with animation
        setTimeout(() => {
            const rollsThisRound = [];
            for (let i = 0; i < playerScores.length; i++) {
                const roll = rollDie();
                playerScores[i] += roll;
                playerLastRolls[i] = roll;
                rollsThisRound.push(roll); // Store rolls for animated display
            }

            // Update dice visuals and scores after animation
            rollsThisRound.forEach((roll, index) => {
                dieElements[index].classList.remove('rolling');
                dieElements[index].textContent = roll;
            });

            updatePlayerDisplay();
            currentRound++;
            checkGameEnd();
            isRolling = false; // Reset rolling state after everything is done
        }, 1000); // Adjust this delay based on your animation duration
    });


    // Event listener for the "Play Again" button
    resetGameBtn.addEventListener('click', resetGame);

    // Initial setup when the page loads
    updatePlayerDisplay();
    currentRoundSpan.textContent = currentRound; // Ensure round is set initially
});
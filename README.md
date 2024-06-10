# Guess the Number Game

Welcome to the Guess the Number Game! This is a simple web-based game where the user tries to guess a randomly generated number between 1 and 100. The game will provide hints if the guessed number is too high or too low, and the player has a limited number of attempts to guess the correct number.

## Features

- Random number generation between 1 and 100
- Hint system to guide the player
- Attempt counter to track the number of guesses
- End game conditions (win or lose)
- Option to restart the game

## Technologies Used

- HTML
- CSS
- Thymeleaf (for templating)
- Java (Spring Boot framework)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle for dependency management
- A modern web browser

### Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/guess-the-number-game.git
    cd guess-the-number-game
    ```

2. **Build the project**:
    If you're using Maven:
    ```bash
    mvn clean install
    ```
    If you're using Gradle:
    ```bash
    gradle build
    ```

3. **Run the application**:
    If you're using Maven:
    ```bash
    mvn spring-boot:run
    ```
    If you're using Gradle:
    ```bash
    gradle bootRun
    ```

4. **Open your web browser** and navigate to:
    ```
    http://localhost:8080
    ```

## How to Play

1. **Enter a number** between 1 and 100 in the input field.
2. **Click "Guess"** to submit your guess.
3. The game will tell you if your guess is too high, too low, or correct.
4. **Continue guessing** until you find the correct number or run out of attempts.
5. If you win or lose, you can click "Play Again" to start a new game.

## File Structure

- `src/main/java`: Contains the Java source files.
- `src/main/resources/templates`: Contains the Thymeleaf template files.
- `src/main/resources/static/css`: Contains the CSS files.
- `src/main/resources/application.properties`: Contains application configurations.

## Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Inspired by classic number guessing games.
- Built with Spring Boot and Thymeleaf.

## Contact

For any questions or feedback, please contact [swainadarsh39@gmail.com].


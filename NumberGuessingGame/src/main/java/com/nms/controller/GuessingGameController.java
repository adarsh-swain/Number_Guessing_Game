package com.nms.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nms.model.Game;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpSession;

@Controller
public class GuessingGameController {

	 private static final int ATTEMPT_LIMIT = 5;
	    private Game game;

	    @PostConstruct
	    public void init() {
	        resetGame();
	    }

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("attempts", game.getAttempts());
	        model.addAttribute("isCorrect", game.isCorrect());
	        model.addAttribute("isGameOver", game.isGameOver());
	        model.addAttribute("hint", game.getHint());
	        return "game";
	    }

	    @PostMapping("/guess")
	    public String guess(@RequestParam int number, Model model) {
	        if (!game.isGameOver() && !game.isCorrect()) {
	            game.incrementAttempts();
	            if (number == game.getTargetNumber()) {
	                game.setCorrect(true);
	                game.setHint("Congratulations! You guessed the correct number!");
	            } else if (number > game.getTargetNumber()) {
	                game.setHint("Your guess is too high!");
	            } else {
	                game.setHint("Your guess is too low!");
	            }
	        }
	        model.addAttribute("attempts", game.getAttempts());
	        model.addAttribute("isCorrect", game.isCorrect());
	        model.addAttribute("isGameOver", game.isGameOver());
	        model.addAttribute("hint", game.getHint());
	        model.addAttribute("guess", number);
	        return "game";
	    }

	    @GetMapping("/reset")
	    public String reset(Model model) {
	        resetGame();
	        model.addAttribute("attempts", game.getAttempts());
	        model.addAttribute("isCorrect", game.isCorrect());
	        model.addAttribute("isGameOver", game.isGameOver());
	        model.addAttribute("hint", game.getHint());
	        return "game";
	    }

	    private void resetGame() {
	        Random random = new Random();
	        int targetNumber = random.nextInt(100) + 1;
	        game = new Game(targetNumber, ATTEMPT_LIMIT);
	    }
}
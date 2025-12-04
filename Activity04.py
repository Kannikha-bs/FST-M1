print("Rock-Paper-Scissors Game")

while True:
    # Get choices from both players
    player1 = input("Player 1, enter Rock, Paper, or Scissors: ").lower()
    player2 = input("Player 2, enter Rock, Paper, or Scissors: ").lower()

    # Determine the winner
    if player1 == player2:
        print("It's a tie!")

    elif (player1 == "rock" and player2 == "scissors") \
         or (player1 == "scissors" and player2 == "paper") \
         or (player1 == "paper" and player2 == "rock"):
        print("Player 1 wins!")
        
    elif (player2 == "rock" and player1 == "scissors") \
         or (player2 == "scissors" and player1 == "paper") \
         or (player2 == "paper" and player1 == "rock"):
        print("Player 2 wins!")

    else:
        print("Invalid input from one or both players!")

    # Ask if they want to play again
    play_again = input("Do you want to play again? (Yes/No): ").lower()

    if play_again != "yes":
        print("Thanks for playing!")
        break
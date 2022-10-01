import random
def main():
print("Black Jack") 

 player = [] 
 dealer = [] 

 for i in range(2): 
   player.append(random.randint(1,10)) 
   dealer.append(random.randint(1,10)) 

 print("Player's cards:", player) 
 print("Dealer's cards:", dealer) 
 player_choice = input("Hit or Pass?").lower() 
 
 while player_choice != "pass": 
   if player_choice == "hit": 
     player.append(random.randint(1,10)) 
     print("Player's cards:", player) 
   player_choice = input("Hit or Pass?").lower() 

 if sum(player) <= 21: 
   while sum(dealer) < 17: 
     dealer.append(random.randint(1,10)) 
     print("Dealer's cards:", dealer) 

 if sum(player) > 21 and sum(dealer) <= 21: 
   print("House wins!") 

 elif sum(dealer) > 21 and sum(player) <= 21: 
   print("Player wins!") 

 elif sum(player) == sum(dealer): 
   print("Draw!") 
   
 elif sum(player) > sum(dealer): 
   print("Player wins!") 

 else: 
   print("House wins!") 

main() 
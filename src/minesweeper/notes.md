# things to note
## why separate board and game classes
Because Board holds the list of Cell and do basic moves
Game hold the game state and handle user input.
## interesting algorithms
1. Randomly place bombs: use card deck shuffling problem(pg. 531). 
Shuffle an array: loop over each index, at index i, randomly swap i with index in range [i+1, N-1].

2. Setting the numbered cells: go through each bomb and increment the number around it.

3. Expanding a blank region: iteratively or recursively. Each blank cell is surrounded by blank cells or numbered cells, no bombs. So when we flip a blank cell, add the neighbors that have not been flipped to a queue to flip next.
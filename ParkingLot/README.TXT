------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Parking Lot

Lessions:
1. A vehicle has two requirements for its parking spot: the number of spots 
and the size of the spots.
2. When a parking spot has multiple levels, having a class for Level is cleaner
than having a 2D-array of spots directly.
3. I made a bad algorithmic decision in findAvailableSpots. Instead of PEAKING forward
 and check for fitting space and then when fail move forward past the fail spot, 
 
 instead you just use a counting method. You never skip forward, but reset the count
for eligible spots. This simpler method is more elegant.
4. When do you use inherited child classes? When the difference is large enough. 
Like Motorcycle, Car, Bus have different num of spot required and type of spots.
But MSpot, CSpot, BSpot are not instantiated because their only difference is SIZE.
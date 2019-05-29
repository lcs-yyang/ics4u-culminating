
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Template for a side-scrolling platform game.
 * 
 * @author R. Gordon
 * @version May 8, 2019
 */
public class SideScrollingWorld extends World
{
    /**
     * Instance variables
     * 
     * These are available for use in any method below.
     */    
    // Tile size in pixels for world elements (blocks, clouds, etc)
    // TO STUDENTS: Modify if your game's tiles have different dimensions
    private static final int TILE_SIZE = 32;
    private static final int HALF_TILE_SIZE = TILE_SIZE / 2;

    // World size constants
    // TO STUDENTS: Modify only if you're sure
    //              Should be a resolution that's a multiple of TILE_SIZE
    private static final int VISIBLE_WIDTH = 640;
    private static final int VISIBLE_HEIGHT = 640;

    // Additional useful constants based on world size
    public static final int HALF_VISIBLE_WIDTH = VISIBLE_WIDTH / 2;
    private static final int HALF_VISIBLE_HEIGHT = VISIBLE_HEIGHT / 2;

    // Defining the boundaries of the scrollable world
    // TO STUDENTS: Modify SCROLLABLE_WIDTH if you wish to have a longer level
    public static final int SCROLLABLE_WIDTH = VISIBLE_WIDTH * 3;
    private static final int SCROLLABLE_HEIGHT = VISIBLE_HEIGHT;

    // Hero
    Hero theHero;

    // Track whether game is on
    private boolean isGameOver;

    /**
     * Constructor for objects of class SideScrollingWorld.
     */
    public SideScrollingWorld()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        // Final argument of 'false' means that actors in the world are not restricted to the world boundary.
        // See: https://www.greenfoot.org/files/javadoc/greenfoot/World.html#World-int-int-int-boolean-
        super(VISIBLE_WIDTH, VISIBLE_HEIGHT, 1, false);

        // Set up the starting scene
        setup();

        // Game on
        isGameOver = false;
    }

    /**
     * Set up the entire world.
     */
    private void setup()
    {
        // TO STUDENTS: Add, revise, or remove methods as needed to define your own game's world
        //addLeftGround();
        addFences();
        //addMetalPlateSteps();
        addClouds();
        // addRightGround();
        addClouds();
        addGround();
        addHero();
        addSpikes();
        addDoor();
    }

    // Adding ground to the world
    private void addGround()
    {
        // Add a block of objects for section 1
        for (int i = 0; i < 7; i++)
        {

            for (int m = 0; m < 7; m++)
            {
                int x = HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 27 * HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }

        // Make blocks for section 2
        for (int i = 0; i < 7; i++)
        {

            for (int m = 0; m < 7; m++)
            {
                int x = 11 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 13 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }
            }
        }        

        // Make blocks for section 3
        for (int i = 0; i < 2; i++)
        {

            for (int m = 0; m < 3; m++)
            {
                int x = 22 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 15 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }
            }
        }        

        // Make blocks for section 4
        for (int i = 0; i < 2; i++)
        {

            for (int m = 0; m < 3; m++)
            {
                int x = 24 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 13 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }        

        // Make blocks for section 5
        for (int i = 0; i < 2; i++)
        {

            for (int m = 0; m < 3; m++)
            {
                int x = 26 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 11 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }        

        // Make blocks for section 6
        for (int i = 0; i < 2; i++)
        {

            for (int m = 0; m < 3; m++)
            {
                int x = 28 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 9 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }        

        // Make blocks for section 7
        for (int i = 0; i < 4; i++)
        {

            for (int m = 0; m < 1; m++)
            {
                int x = 34 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 7 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }        

        // Make blocks for section 8 （level 1 checkpoint）
        for (int i = 0; i < 8; i++)
        {

            for (int m = 0; m < 15; m++)
            {
                int x = 42 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 5 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (m == 0)
                {
                    Ground anObject = new Ground(x,y);
                    addObject(anObject, x, y);
                }
                else
                {
                    GroundBelow anObject = new GroundBelow(x,y);
                    addObject(anObject, x, y);
                }

            }
        }
    }    

    private void addSpikes()
    {
        for (int i = 0; i < 1; i++)
        {

            int x = 14 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 12 * TILE_SIZE + HALF_TILE_SIZE + HALF_TILE_SIZE / 2;

            Spikes anObject = new Spikes(x,y);

            int x = 13 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 12 * TILE_SIZE + HALF_TILE_SIZE;
            
            Spike anObject = new Spike(x,y);

            addObject(anObject, x, y);
        }   

        for (int i = 0; i < 1; i++)
        {
            int x = 45 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4 * TILE_SIZE + HALF_TILE_SIZE + HALF_TILE_SIZE / 2;

            Spikes anObject = new Spikes(x,y);
            addObject(anObject, x, y);
        }   
    }   

    private void addDoor()
    {
        for (int i = 0; i < 1; i++)
        {
            int x = 48 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4 * TILE_SIZE - HALF_TILE_SIZE;

            Door anObject = new Door(x,y);
            addObject(anObject, x, y);
        }  
    }

    /**
     * Add blocks to create the ground to walk on at bottom-left of scrollable world.

    private void addLeftGround()
    {
    // How many tiles will cover the bottom of the initial visible area of screen?
    final int tilesToCreate = getWidth() / TILE_SIZE;

    // Loop to create and add the tile objects
    for (int i = 0; i < tilesToCreate; i += 1)
    {
    // Add ground objects at bottom of screen
    // NOTE: Actors are added based on their centrepoint, so the math is a bit trickier.
    int x = i * TILE_SIZE + HALF_TILE_SIZE;
    int y = getHeight() - HALF_TILE_SIZE;

    // Create a ground tile
    Ground groundTile = new Ground(x, y);

    // Add the objects
    addObject(groundTile, x, y);
    }
    }
     */

    /**
     * Add some fences at left and right side.
     */

    //revised to become fire image
    private void addFences()
    {
        // Three fences on left side of world
        int x = HALF_TILE_SIZE + TILE_SIZE * 7;
        int y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence1 = new Fence(x, y);
        addObject(fence1, x, y);

        //add first group of fire
        x = HALF_TILE_SIZE + TILE_SIZE * 8;
        y = VISIBLE_HEIGHT - TILE_SIZE;        
        Fence fence2 = new Fence(x, y);
        addObject(fence2, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 9;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence3 = new Fence(x, y);
        addObject(fence3, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 10;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence4 = new Fence(x, y);
        addObject(fence4, x, y);

        //add second group of fire
        x = HALF_TILE_SIZE + TILE_SIZE * 18;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence5 = new Fence(x, y);
        addObject(fence5, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 19;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence6 = new Fence(x, y);
        addObject(fence6, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 20;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence7 = new Fence(x, y);
        addObject(fence7, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 21;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence8 = new Fence(x, y);
        addObject(fence8, x, y);

        //add third group of fire
        x = HALF_TILE_SIZE + TILE_SIZE * 30;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence9 = new Fence(x, y);
        addObject(fence9, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 31;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence10 = new Fence(x, y);
        addObject(fence10, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 32;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence11 = new Fence(x, y);
        addObject(fence11, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 33;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence12 = new Fence(x, y);
        addObject(fence12, x, y);

        //add fourth group of fire
        x = HALF_TILE_SIZE + TILE_SIZE * 39;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence13 = new Fence(x, y);
        addObject(fence13, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 40;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence14 = new Fence(x, y);
        addObject(fence14, x, y);

        x = HALF_TILE_SIZE + TILE_SIZE * 41;
        y = VISIBLE_HEIGHT - TILE_SIZE;
        Fence fence15 = new Fence(x, y);
        addObject(fence15, x, y);

    }

    /**
     * Add steps made out of metal plates leading to end of world.
     */
    private void addMetalPlateSteps()
    {
        // How many plates total?
        final int COUNT_OF_METAL_PLATES = 20;
        final int PLATES_PER_GROUP = 4;

        // Add groups of plates
        for (int i = 0; i < COUNT_OF_METAL_PLATES / PLATES_PER_GROUP; i += 1)
        {
            // Group of four metal plates all at same y position
            int y = VISIBLE_HEIGHT - HALF_TILE_SIZE * 3 - i * TILE_SIZE;

            // Add the individual plates in a given group
            for (int j = 0; j < PLATES_PER_GROUP; j += 1)
            {
                int x = VISIBLE_WIDTH + TILE_SIZE * 2 + TILE_SIZE * (i + j) + TILE_SIZE * 5 * i;
                MetalPlate plate = new MetalPlate(x, y);
                addObject(plate, x, y);
            }
        }
    }

    /**
     * Add a few clouds for the opening scene.
     */
    private void addClouds()
    {
        Cloud cloud1 = new Cloud(170, 125);
        addObject(cloud1, 170, 125);
        Cloud cloud2 = new Cloud(450, 175);
        addObject(cloud2, 450, 175);
        Cloud cloud3 = new Cloud(775, 50);
        addObject(cloud3, 775, 50);
    }

    /**
     * Act
     * 
     * This method is called approximately 60 times per second.
     */
    public void act()
    {
    }

    /**
     * Add the hero to the world.
     */
    private void addHero()
    {
        // Initial horizontal position
        int initialX = TILE_SIZE * 3;

        // Instantiate the hero object
        theHero = new Hero(initialX);

        // Add hero in bottom left corner of screen
        addObject(theHero, initialX, getHeight() / 100 * 66);
    }

    /**
     * Add blocks to create the ground to walk on at top-right of scrollable world.
     */
    private void addRightGround()
    {
        // Constants to control dimensions of the ground at end of world
        final int COUNT_OF_GROUND = 8;
        final int GROUND_BELOW_COLUMNS = COUNT_OF_GROUND;
        final int GROUND_BELOW_ROWS = 6;
        final int COUNT_OF_GROUND_BELOW = GROUND_BELOW_COLUMNS * GROUND_BELOW_ROWS;

        // 1. Make ground at end of level (top layer)
        for (int i = 0; i < COUNT_OF_GROUND; i += 1)
        {
            // Position in wider scrollable world
            int x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - i * TILE_SIZE;
            int y = HALF_VISIBLE_HEIGHT + TILE_SIZE;

            // Create object and add it
            Ground ground = new Ground(x, y);
            addObject(ground, x, y);
        }

        // 2. Make sub-ground at end of level (below top layer)
        for (int i = 0; i < GROUND_BELOW_COLUMNS; i += 1)
        {
            for (int j = 0; j < GROUND_BELOW_ROWS; j += 1)
            {
                // Position in wider scrollable world
                int x = SCROLLABLE_WIDTH - HALF_TILE_SIZE - i * TILE_SIZE;
                int y = HALF_VISIBLE_HEIGHT + TILE_SIZE + TILE_SIZE * (j + 1);

                // Create object and add it
                GroundBelow groundBelow = new GroundBelow(x, y);
                addObject(groundBelow, x, y);
            }
        }
    }

    /**
     * Return an object reference to the hero.
     */
    public Hero getHero()
    {
        return theHero;
    }

    /**
     * Set game over
     */
    public void setGameOver()
    {
        isGameOver = true;
    }
}



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
    public static final int SCROLLABLE_WIDTH = VISIBLE_WIDTH * 6;
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
        addFences();
        addClouds();
        addGround();
        addHero();
        addSpikes();
        addDoor();
        addRight();
        addSpring();
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

    private void addRight()
    {
        // Add stair cases
        for (int i = 0; i < 3; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 50 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
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

        for (int i = 0; i < 3; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 53 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
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

        for (int i = 0; i < 3; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 56 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
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

        for (int i = 0; i < 3; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 59 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
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

        for (int i = 0; i < 9; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 62 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
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

        // Add the ground with gap
        for (int i = 0; i < 12; i++)
        {
            for (int m = 0; m < 8; m++)
            {
                int x = 75 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 13 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (i == 5 || i == 6)
                {

                }
                else if (m == 0)
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

        // Add the upper bound
        for (int i = 0; i < 4; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 79 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 8 * TILE_SIZE + HALF_TILE_SIZE - m * TILE_SIZE;

                MetalPlate anObject = new MetalPlate(x,y);
                addObject(anObject, x, y);

            }
        }

        // Add the low grounds
        for (int i = 0; i < 11; i++)
        {
            for (int m = 0; m < 3; m++)
            {
                int x = 95 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 18 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
                if (i == 4 || i == 6 || i == 8)
                {

                }
                else if (m == 0)
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

        // Add the ground for the gate
        for (int i = 0; i < 3; i++)
        {
            for (int m = 0; m < 15; m++)
            {
                int x = 117 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
                int y = 8 * TILE_SIZE + HALF_TILE_SIZE + m * TILE_SIZE;
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

    // Add spring to the level
    private void addSpring()
    {
        for (int i = 0; i < 1; i++)
        {
            int x = 91 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 13 * TILE_SIZE + HALF_TILE_SIZE;
            spring anObject = new spring(x,y);
            addObject(anObject, x, y);
        }   
        
        for (int i = 0; i < 1; i++)
        {
            int x = 109 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 14 * TILE_SIZE + HALF_TILE_SIZE;
            spring anObject = new spring(x,y);
            addObject(anObject, x, y);
        }   
        
        for (int i = 0; i < 1; i++)
        {
            int x = 113 * TILE_SIZE + HALF_TILE_SIZE;
            int y = 11 * TILE_SIZE + HALF_TILE_SIZE;
            spring anObject = new spring(x,y);
            addObject(anObject, x, y);
        }   
        
    }

    private void addSpikes()
    {
        for (int i = 0; i < 1; i++)
        {

            int x = 14 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 12 * TILE_SIZE + HALF_TILE_SIZE + HALF_TILE_SIZE / 2;

            Spikes anObject = new Spikes(x,y);
            addObject(anObject, x, y);
        }   

        for (int i = 0; i < 1; i++)
        {
            int x = 45 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 4 * TILE_SIZE + HALF_TILE_SIZE + HALF_TILE_SIZE / 2;

            Spikes anObject = new Spikes(x,y);
            addObject(anObject, x, y);
        }   

        for (int i = 0; i < 1; i++)
        {
            int x = 63 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 14 * TILE_SIZE + HALF_TILE_SIZE + HALF_TILE_SIZE / 2;

            Spikes anObject = new Spikes(x,y);
            addObject(anObject, x, y);
        }   
    }   

    private void addDoor()
    {
        for (int i = 0; i < 1; i++)
        {
            int x = 118 * TILE_SIZE + HALF_TILE_SIZE + i * TILE_SIZE;
            int y = 7 * TILE_SIZE - HALF_TILE_SIZE;

            Door anObject = new Door(x,y);
            addObject(anObject, x, y);
        }  
    }

    /**
     * Add some fences at left and right side.
     */

    //revised to become fire image
    private void addFences()
    {
        for (int i = 7; i <= 10; i++)
        {

            // Three fences on left side of world
            int x = HALF_TILE_SIZE + TILE_SIZE * i;
            int y = VISIBLE_HEIGHT - TILE_SIZE;
            Fence fence1 = new Fence(x, y);
            addObject(fence1, x, y);
        }

        for (int i = 18; i <= 41; i++)
        {

            // Three fences on left side of world
            int x = HALF_TILE_SIZE + TILE_SIZE * i;
            int y = VISIBLE_HEIGHT - TILE_SIZE;
            Fence fence1 = new Fence(x, y);
            addObject(fence1, x, y);
        }

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


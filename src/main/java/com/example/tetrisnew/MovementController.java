package com.example.tetrisnew;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.*;

public class MovementController {

        //Getting numbers and MESH from Tetris class
        public static final int MOVE = HelloApplication.MOVE;
        public static final int SIZE = HelloApplication.SIZE;
        public static int XMAX = HelloApplication.XMAX;
        public static int YMAX = HelloApplication.YMAX;
        public static int[][] MESH = HelloApplication.MESH;

        //moving blocks
        public static void MoveRight(Form form) {
            if (form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE
                    && form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE) {
                int movea = MESH[((int) form.a.getX() / SIZE) + 1][((int) form.a.getY() / SIZE)];
                int moveb = MESH[((int) form.b.getX() / SIZE) + 1][((int) form.b.getY() / SIZE)];
                int movec = MESH[((int) form.c.getX() / SIZE) + 1][((int) form.c.getY() / SIZE)];
                int moved = MESH[((int) form.d.getX() / SIZE) + 1][((int) form.d.getY() / SIZE)];
                if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
                    form.a.setX(form.a.getX() + MOVE);
                    form.b.setX(form.a.getX() + MOVE);
                    form.c.setX(form.a.getX() + MOVE);
                    form.d.setX(form.a.getX() + MOVE);
                }
            }
        }

        public static void MoveLeft(Form form) {
            if (form.a.getX() - MOVE >= 0 && form.b.getX() - MOVE >= 0
                    && form.c.getX() - MOVE >= 0 && form.d.getX() - MOVE >= 0) {
                int movea = MESH[((int) form.a.getX() / SIZE) - 1][((int) form.a.getY() / SIZE)];
                int moveb = MESH[((int) form.b.getX() / SIZE) - 1][((int) form.b.getY() / SIZE)];
                int movec = MESH[((int) form.c.getX() / SIZE) - 1][((int) form.c.getY() / SIZE)];
                int moved = MESH[((int) form.d.getX() / SIZE) - 1][((int) form.d.getY() / SIZE)];
                if (movea == 0 && movea == moveb && moveb == movec && movec == moved) {
                    form.a.setX(form.a.getX() - MOVE);
                    form.b.setX(form.a.getX() - MOVE);
                    form.c.setX(form.a.getX() - MOVE);
                    form.d.setX(form.a.getX() - MOVE);
                }

            }
        }

        //crete Stones
        public static Form makeRect(){
            int block = (int) (Math.random()*100);
            String name;

            Rectangle a = new Rectangle(SIZE-1, SIZE-1),
                    b = new Rectangle(SIZE-1, SIZE-1),
                    c = new Rectangle(SIZE-1, SIZE-1),
                    d = new Rectangle(SIZE-1, SIZE-1);

            return null;
        }
    }

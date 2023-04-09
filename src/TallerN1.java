import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class TallerN1 {
    public static void main(String[] args) {

        //  Datos para definir el tamaño de la imagen en la que aparecera la linea
        double min=-1.0;
        double max=1.0;
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        StdDraw.enableDoubleBuffering();

        /// Variables para definir las lineas y su ubicacion
        double x0= min +(max-min)*Math.random();
        double y0= min +(max-min)*Math.random();
        double x1= min +(max-min)*Math.random();
        double y1= min +(max-min)*Math.random();

        double x2=x0-0.02;
        double y2=y0-0.02;
        double x3=x1-0.02;
        double y3=y1-0.02;
        double x4=x2-0.02;
        double y4=y2-0.02;
        double x5=x3-0.02;
        double y5=y3-0.02;
        double x6=x4-0.02;
        double y6=y4-0.02;
        double x7=x5-0.02;
        double y7=y5-0.02;
        double x8=x6-0.02;
        double y8=y6-0.02;
        double x9=x7-0.02;
        double y9=y7-0.02;
        double x10=x8-0.02;
        double y10=y8-0.02;
        double x11=x9-0.02;
        double y11=y9-0.02;
        double tamañoLinea=0.1;

        // Variables de las velocidades de cada linea
        double VelocidadX=Math.random()/450;
        double VelocidadY=Math.random()/450;
        double VelocidadX1=VelocidadX;
        double VelocidadY1=VelocidadY;
        double VelocidadX2=VelocidadX;
        double VelocidadY2=VelocidadY;
        double VelocidadX3=VelocidadX;
        double VelocidadY3=VelocidadY;
        double VelocidadX4=VelocidadX;
        double VelocidadY4=VelocidadY;
        double VelocidadX5=VelocidadX;
        double VelocidadY5=VelocidadY;
        double VelocidadX6=VelocidadX;
        double VelocidadY6=VelocidadY;
        double VelocidadX7=VelocidadX;
        double VelocidadY7=VelocidadY;
        double VelocidadX8=VelocidadX;
        double VelocidadY8=VelocidadY;
        double VelocidadX9=VelocidadX;
        double VelocidadY9=VelocidadY;
        double VelocidadX10=VelocidadX;
        double VelocidadY10=VelocidadY;
        double VelocidadX11=VelocidadX;
        double VelocidadY11=VelocidadY;

        ///Definicion de las lineas

        while (true){


            if (Math.abs(x0+VelocidadX)>1.1-tamañoLinea){
                VelocidadX=-VelocidadX;
            }
            if (Math.abs(y0+VelocidadY)>1.1-tamañoLinea){
                VelocidadY= -VelocidadY;
            }
            if (Math.abs(x1+VelocidadX1)>1.1-tamañoLinea){
                VelocidadX1=-VelocidadX1;
            }
            if (Math.abs(y1+VelocidadY1)>1.1-tamañoLinea){
                VelocidadY1=-VelocidadY1;
            }

            if (Math.abs(x2+VelocidadX2)>1.1-tamañoLinea){
                VelocidadX2=-VelocidadX2;
            }
            if (Math.abs(y2+VelocidadY2)>1.1-tamañoLinea){
                VelocidadY2= -VelocidadY2;
            }
            if (Math.abs(x3+VelocidadX3)>1.1-tamañoLinea){
                VelocidadX3=-VelocidadX3;
            }
            if (Math.abs(y3+VelocidadY3)>1.1-tamañoLinea){
                VelocidadY3=-VelocidadY3;
            }

            if (Math.abs(x4+VelocidadX4)>1.1-tamañoLinea){
                VelocidadX4=-VelocidadX4;
            }
            if (Math.abs(y4+VelocidadY4)>1.1-tamañoLinea){
                VelocidadY4= -VelocidadY4;
            }
            if (Math.abs(x5+VelocidadX5)>1.1-tamañoLinea){
                VelocidadX5=-VelocidadX5;
            }
            if (Math.abs(y5+VelocidadY5)>1.1-tamañoLinea){
                VelocidadY5=-VelocidadY5;
            }

            if (Math.abs(x6+VelocidadX6)>1.1-tamañoLinea){
                VelocidadX6=-VelocidadX6;
            }
            if (Math.abs(y6+VelocidadY6)>1.1-tamañoLinea){
                VelocidadY6= -VelocidadY6;
            }
            if (Math.abs(x7+VelocidadX7)>1.1-tamañoLinea){
                VelocidadX7=-VelocidadX7;
            }
            if (Math.abs(y7+VelocidadY7)>1.1-tamañoLinea){
                VelocidadY7=-VelocidadY7;
            }

            if (Math.abs(x8+VelocidadX8)>1.1-tamañoLinea){
                VelocidadX8=-VelocidadX8;
            }
            if (Math.abs(y8+VelocidadY8)>1.1-tamañoLinea){
                VelocidadY8= -VelocidadY8;
            }
            if (Math.abs(x9+VelocidadX9)>1.1-tamañoLinea){
                VelocidadX9=-VelocidadX9;
            }
            if (Math.abs(y9+VelocidadY9)>1.1-tamañoLinea){
                VelocidadY9=-VelocidadY9;
            }

            if (Math.abs(x10+VelocidadX10)>1.1-tamañoLinea){
                VelocidadX10=-VelocidadX10;
            }
            if (Math.abs(y10+VelocidadY10)>1.1-tamañoLinea){
                VelocidadY10= -VelocidadY10;
            }
            if (Math.abs(x11+VelocidadX11)>1.1-tamañoLinea){
                VelocidadX11=-VelocidadX11;
            }
            if (Math.abs(y11+VelocidadY11)>1.1-tamañoLinea){
                VelocidadY11=-VelocidadY11;
            }

            /// Definicion de velocidades de las lineas
            x0+=VelocidadX;
            y0+=VelocidadY;
            x1+=VelocidadX1;
            y1+=VelocidadY1;

            x2+=VelocidadX2;
            y2+=VelocidadY2;
            x3+=VelocidadX3;
            y3+=VelocidadY3;

            x4+=VelocidadX4;
            y4+=VelocidadY4;
            x5+=VelocidadX5;
            y5+=VelocidadY5;

            x6+=VelocidadX6;
            y6+=VelocidadY6;
            x7+=VelocidadX7;
            y7+=VelocidadY7;

            x8+=VelocidadX8;
            y8+=VelocidadY8;
            x9+=VelocidadX9;
            y9+=VelocidadY9;

            x10+=VelocidadX10;
            y10+=VelocidadY10;
            x11+=VelocidadX11;
            y11+=VelocidadY11;


            StdDraw.clear();

            ///// Definicion de colores de cada linea
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.line(x0,y0,x1,y1);
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.line(x2,y2,x3,y3);
            StdDraw.setPenColor(Color.RED);
            StdDraw.line(x4,y4,x5,y5);
            StdDraw.setPenColor(Color.CYAN);
            StdDraw.line(x6,y6,x7,y7);
            StdDraw.setPenColor(Color.GRAY);
            StdDraw.line(x8,y8,x9,y9);
            StdDraw.setPenColor(Color.PINK);
            StdDraw.line(x10,y10,x11,y11);
            StdDraw.show();


        }


    }
}


//#version 400

attribute vec4 a_Position;
attribute vec4 a_Color;

uniform mat4 u_Matrix;

varying vec4 v_Color;

void main() {

    v_Color = a_Color;
//u_Matrix*
    gl_Position =   a_Position;
    gl_PointSize = 50.0;

}

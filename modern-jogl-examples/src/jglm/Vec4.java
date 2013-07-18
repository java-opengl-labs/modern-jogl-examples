/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jglm;

/**
 *
 * @author gbarbieri
 */
public class Vec4 extends Vec {

    public float x;
    public float y;
    public float z;
    public float w;

    public Vec4() {
    }

    public Vec4(float[] vec4) {
        vector = vec4;
        x = vector[0];
        y = vector[1];
        z = vector[2];
        w = vector[3];
    }

    public Vec4(Vec3 vec3, float w) {
        x = vec3.x;
        y = vec3.y;
        z = vec3.z;
        this.w = w;
        vector = new float[]{x, y, z, this.w};
    }

    public Vec4(float[] floatArray, int i) {
        vector = new float[]{floatArray[i], floatArray[i + 1], floatArray[i + 2], floatArray[i + 3]};
        x = vector[0];
        y = vector[1];
        z = vector[2];
        w = vector[3];
    }

    public Vec4(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        vector = new float[]{this.x, this.y, this.z, this.w};
    }
}

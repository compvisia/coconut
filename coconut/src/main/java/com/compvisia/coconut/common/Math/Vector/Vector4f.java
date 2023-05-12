package com.compvisia.coconut.common.Math.Vector;

public class Vector4f {

    public float x,y,z,w;

    public Vector4f(float x, float y, float z, float w) { this.x=x;this.y=y;this.z=z;this.w=w; }

    // Mathematics
    public Vector4f add(Vector4f a) { return new Vector4f(x+=a.x,y+=a.y,z+=a.z,w+=a.w); }
    public Vector4f sub(Vector4f a) { return new Vector4f(x-=a.x,y-=a.y,z-=a.z,w-=a.w); }
    public Vector4f mul(Vector4f a) { return new Vector4f(x*=a.x,y*=a.y,z*=a.z,w*=a.w); }
    public Vector4f div(Vector4f a) { return new Vector4f(x/=a.x,y/=a.y,z/=a.z,w/=a.w); }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.android.goldeneye.core;

class GoldenEyeJNI {

  static {
    try {
  	     System.loadLibrary("goldeneye");
    } catch (UnsatisfiedLinkError e) {
    	throw e;
    }
  }

  public final static native String convertToGreyScale(String jarg1);
  public final static native String detectFaces(String jarg1);
  public final static native int train(String jarg1, int jarg2, String jarg3);
  public final static native String recognizeFace(String jarg1, String jarg2);
  public final static native void init(String jarg1, String jarg2, String jarg3);
  public final static native void destroy();
}

/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_lwjgl_opengl_LinuxEvent */

#ifndef _Included_org_lwjgl_opengl_LinuxEvent
#define _Included_org_lwjgl_opengl_LinuxEvent
#ifdef __cplusplus
extern "C" {
#endif
#undef org_lwjgl_opengl_LinuxEvent_FocusIn
#define org_lwjgl_opengl_LinuxEvent_FocusIn 9L
#undef org_lwjgl_opengl_LinuxEvent_FocusOut
#define org_lwjgl_opengl_LinuxEvent_FocusOut 10L
#undef org_lwjgl_opengl_LinuxEvent_KeyPress
#define org_lwjgl_opengl_LinuxEvent_KeyPress 2L
#undef org_lwjgl_opengl_LinuxEvent_KeyRelease
#define org_lwjgl_opengl_LinuxEvent_KeyRelease 3L
#undef org_lwjgl_opengl_LinuxEvent_ButtonPress
#define org_lwjgl_opengl_LinuxEvent_ButtonPress 4L
#undef org_lwjgl_opengl_LinuxEvent_ButtonRelease
#define org_lwjgl_opengl_LinuxEvent_ButtonRelease 5L
#undef org_lwjgl_opengl_LinuxEvent_MotionNotify
#define org_lwjgl_opengl_LinuxEvent_MotionNotify 6L
#undef org_lwjgl_opengl_LinuxEvent_EnterNotify
#define org_lwjgl_opengl_LinuxEvent_EnterNotify 7L
#undef org_lwjgl_opengl_LinuxEvent_LeaveNotify
#define org_lwjgl_opengl_LinuxEvent_LeaveNotify 8L
#undef org_lwjgl_opengl_LinuxEvent_UnmapNotify
#define org_lwjgl_opengl_LinuxEvent_UnmapNotify 18L
#undef org_lwjgl_opengl_LinuxEvent_MapNotify
#define org_lwjgl_opengl_LinuxEvent_MapNotify 19L
#undef org_lwjgl_opengl_LinuxEvent_Expose
#define org_lwjgl_opengl_LinuxEvent_Expose 12L
#undef org_lwjgl_opengl_LinuxEvent_ConfigureNotify
#define org_lwjgl_opengl_LinuxEvent_ConfigureNotify 22L
#undef org_lwjgl_opengl_LinuxEvent_ClientMessage
#define org_lwjgl_opengl_LinuxEvent_ClientMessage 33L
/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    createEventBuffer
 * Signature: ()Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_org_lwjgl_opengl_LinuxEvent_createEventBuffer
  (JNIEnv *, jclass);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    getPending
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_getPending
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nSendEvent
 * Signature: (Ljava/nio/ByteBuffer;JJZJ)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_LinuxEvent_nSendEvent
  (JNIEnv *, jclass, jobject, jlong, jlong, jboolean, jlong);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nFilterEvent
 * Signature: (Ljava/nio/ByteBuffer;J)Z
 */
JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_LinuxEvent_nFilterEvent
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nNextEvent
 * Signature: (JLjava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_LinuxEvent_nNextEvent
  (JNIEnv *, jclass, jlong, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetType
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetType
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetWindow
 * Signature: (Ljava/nio/ByteBuffer;)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetWindow
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nSetWindow
 * Signature: (Ljava/nio/ByteBuffer;J)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_LinuxEvent_nSetWindow
  (JNIEnv *, jclass, jobject, jlong);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetFocusMode
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetFocusMode
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetFocusDetail
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetFocusDetail
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetClientMessageType
 * Signature: (Ljava/nio/ByteBuffer;)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetClientMessageType
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetClientData
 * Signature: (Ljava/nio/ByteBuffer;I)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetClientData
  (JNIEnv *, jclass, jobject, jint);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetClientFormat
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetClientFormat
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonTime
 * Signature: (Ljava/nio/ByteBuffer;)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonTime
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonState
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonState
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonType
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonType
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonButton
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonButton
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonRoot
 * Signature: (Ljava/nio/ByteBuffer;)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonRoot
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonXRoot
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonXRoot
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonYRoot
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonYRoot
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonX
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonX
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetButtonY
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetButtonY
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetKeyAddress
 * Signature: (Ljava/nio/ByteBuffer;)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetKeyAddress
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetKeyTime
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetKeyTime
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetKeyType
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetKeyType
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetKeyKeyCode
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetKeyKeyCode
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_LinuxEvent
 * Method:    nGetKeyState
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_LinuxEvent_nGetKeyState
  (JNIEnv *, jclass, jobject);

#ifdef __cplusplus
}
#endif
#endif

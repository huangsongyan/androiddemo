#include "com_hubery_androiddemo_ui_jni_JniCore.h"
#include <string>
#include <iostream>
#include  <android/log.h>
// log标签
#define  TAG    "jniLog"
// 定义info信息
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,TAG,__VA_ARGS__)
// 定义debug信息
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, TAG, __VA_ARGS__)
// 定义error信息
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,TAG,__VA_ARGS__)

using namespace std;
/*
 * Class:     com_hubery_androiddemo_ui_jni_JniCore
 * Method:    add
 * Signature: ()V
 */
JNIEXPORT jstring JNICALL Java_com_hubery_androiddemo_jni_JniCore_add
        (JNIEnv *env, jclass) {

}

JNIEXPORT jstring JNICALL
Java_com_hubery_androiddemo_jni_JniCore_hello(JNIEnv *env, jclass type, jstring str_) {

    //从jstring转为c++的char *；env->GetStringUTFChars(str_,NULL);


    const char *test = env->GetStringUTFChars(str_, false);
    const char *str = env->GetStringUTFChars(str_, 0);

    string string1 = "123";
    // string to char * : string1.c_str();
    // TODO

    //env->ReleaseStringUTFChars(str_, str);

    //c++ char * 转为jstring : env->NewStringUTF();

    int num = 100;
    char temp[64];
    sprintf(temp, "%d", num);
    string s(temp);
    //调用string的方法
    cout<<s.c_str()<<endl;//1000
    cout<<s.size()<<endl;  //长度为4
    LOGD("the num is %s",s.c_str());

    //调用jave方法。再回调

//    const char* className =
//            "cn/hslive/zq/sdk/core/listener/ZQConnectionListener";
//    _cls = env->FindClass(className);
//    if (_cls == NULL) {
//        YiLog::getInstance().e("Native registration unable to find class '%s'",
//                               className);
//        return JNI_FALSE;
//    }
//
//    _onTLSConnect = env->GetMethodID(_cls, "onTLSConnect",
//                                     "(Lcn/hslive/zq/sdk/util/ZQParamsExt;)Z");
//    if (NULL == _onTLSConnect) {
//        YiLog::getInstance().e(
//                "find ZQConnectionListener onTLSConnect method failed");
//        return JNI_FALSE;
//    }
//
//    _onConnect = env->GetMethodID(_cls, "onConnect", "()V");
//    if (NULL == _onConnect) {
//        YiLog::getInstance().e(
//                "find ZQConnectionListener onConnect method failed");
//        return JNI_FALSE;
//    }
//
//    _onDisconnect = env->GetMethodID(_cls, "onDisconnect", "(I)V");
//    if (NULL == _onDisconnect) {
//        YiLog::getInstance().e(
//                "find ZQConnectionListener onDisconnect method failed");
//        return JNI_FALSE;
//    }

    return env->NewStringUTF(s.c_str());
}
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := str
LOCAL_SRC_FILES := str.c

include $(BUILD_SHARED_LIBRARY)
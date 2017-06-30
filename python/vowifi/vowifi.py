import codecs
import os
import re


def call_vowifi():
    print("enter call_vowifi");
    os.system("adb shell am start com.android.phone/com.android.phone.CallFeaturesSetting");
    os.system("adb shell input keyevent KEYCODE_TAB");
    os.system("adb shell input keyevent KEYCODE_TAB");
    os.system("adb shell input keyevent KEYCODE_TAB");
    os.system("adb shell input keyevent KEYCODE_TAB");
   os.system("adb shell input keyevent KEYCODE_ENTER");
                                    switchWIFI();


                                    def switchWIFI():
                                        print("enter switchWIFI");

                                                mSwitch = 0;
                                                    os.system("adb shell am start -a android.intent.action.MAIN -n
                                                    com.lge.wifisettings/.WifiSettings");
                                                    os.system("adb shell input keyevent KEYCODE_TAB");
                                                            os.system("adb shell input keyevent KEYCODE_TAB");
                                                                os.system("adb shell input keyevent KEYCODE_TAB");
                                                                    currentView = "adb shell dumpsys input_method |
                                                                    findstr mServedView";

                                                                        if (mSwitch == 0):
                                                                            currentView = "adb shell dumpsys
                                                                                    input_method | findstr mServedView";
                                                                                            count = 0;
                                                                                                    os.system("adb shell
                                                                                                    input keyevent
                                                                                                    KEYCODE_DPAD_UP");
                                                                                                    os.system("adb
                                                                                                            shell input
                                                                                                            keyevent
                                                                                                            KEYCODE_ENTER");


                                                                                                    def
                                                                                                            get_log():
                                                                                                                os.system("adb
                                                                                                                    pull
                                                                                                                    data/logger
                                                                                                                    .");


                                                                                                                def
                                                                                                                    log_open():
                                                                                                                        print("read
                                                                                                                            log");
                                                                                                                        f
                                                                                                                                =
                                                                                                                                codecs.open("./logger/radio.log",
                                                                                                                                        'rb',
                                                                                                                                        encoding='utf-8',
                                                                                                                                        errors='replace')
                                                                                                                                # fw
                                                                                                                                    # =
                                                                                                                                    # open("./logger/sample.log",
                                                                                                                                    # 'w',
                                                                                                                                    # encoding='utf-8',
                                                                                                                                    # errors='replace')

                                                                                                                                        while
                                                                                                                                        True:
                                                                                                                                            line
                                                                                                                                                    =
                                                                                                                                                    f.readline()
                                                                                                                                                            if
                                                                                                                                                            not
                                                                                                                                                            line:
                                                                                                                                                                break
                                                                                                                                                            print(line)
                                                                                                                                                                            # fw.write(line)

                                                                                                                                                                                f.close()
                                                                                                                                                                                    # fw.close()


                                                                                                                                                                                    if
                                                                                                                                                                                    __name__
                                                                                                                                                                                    ==
                                                                                                                                                                                    '__main__':
                                                                                                                                                                                        print("enter
                                                                                                                                                                                            main")
                                                                                                                                                                                        # call_vowifi();
                                                                                                                                                                                                    # get_log();
                                                                                                                                                                                                        log_open();


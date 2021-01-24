
    <test name="Honor 8" parallel="classes" thread-count="1">
        <parameter name="platformName" value="Android"/>
        <parameter name="deviceName" value="HUAWEI FRD-L19"/>
        <parameter name="platformVersion" value="7"/>
        <parameter name="udid" value="P6LDU17113003345"/>
        <parameter name="port" value="4730"/>
        <classes>
            <class name="global.APP.starter.CukesGlobalRunner"/>
        </classes>
    </test>

        <test name="Iphone 8" parallel="classes" thread-count="1">
            <parameter name="platformName" value="iOS"/>
            <parameter name="deviceName" value="Real iphone 8"/>
            <parameter name="platformVersion" value="12.1"/>
            <parameter name="udid" value="90ebc26513810e02ee05fc99f08482c739332e03"/>
            <parameter name="port" value="4730"/>
            <classes>
                <class name="global.APP.starter.CukesGlobalRunner"/>
            </classes>
        </test>







            appium -p 4740 -bp 8201 -U "P6LDU17113003345"
            appium -p 4750 -bp 8200 -U "UEEDU18526003357"

            node . -p 4740 -bp 8201 -U "P6LDU17113003345"

            node . -p 4750 -bp 8200 -U "UEEDU18526003357"
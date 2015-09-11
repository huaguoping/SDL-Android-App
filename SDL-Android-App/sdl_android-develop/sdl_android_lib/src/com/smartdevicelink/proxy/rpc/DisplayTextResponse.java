package com.smartdevicelink.proxy.rpc;


//Huaguoping-Add-20150831
import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;

public class DisplayTextResponse extends RPCResponse 
{

    public DisplayTextResponse() 
    {
        super(FunctionID.DISPLAYTEXT.toString());
    }

	
    public DisplayTextResponse(Hashtable<String, Object> hash) 
    {
        super(hash);
    }
}
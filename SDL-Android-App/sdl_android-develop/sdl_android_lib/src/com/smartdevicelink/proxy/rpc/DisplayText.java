package com.smartdevicelink.proxy.rpc;

//Huaguoping-Add-20150831
//import java.util.ArrayList;
import java.util.Hashtable;
//import java.util.List;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

public class DisplayText extends RPCRequest
{

	public DisplayText() 
	{
		super(FunctionID.DISPLAYTEXT.toString());
		// TODO Auto-generated constructor stub
	}
	
	public DisplayText(Hashtable<String, Object> hash) 
	{
		super(hash);
	}
	
}
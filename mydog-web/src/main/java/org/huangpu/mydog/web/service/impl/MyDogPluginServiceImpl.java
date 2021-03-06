package org.huangpu.mydog.web.service.impl;

import org.huangpu.mydog.web.core.plugin.loader.MyDogPluginParamsLoaderTemplate;
import org.huangpu.mydog.web.service.MyDogPluginService;
import org.huangpu.mydog.web.vo.MyDogPluginsParams;
import org.springframework.stereotype.Service;

/**
 * @author xusihan on 2017.07.25
 */
@Service
public class MyDogPluginServiceImpl implements MyDogPluginService{
	
	@Override
	public void parsePluginParams(MyDogPluginsParams myDogPluginsParams) {
		MyDogPluginParamsLoaderTemplate template = new MyDogPluginParamsLoaderTemplate();
		template.loadMyDogPluginParams(myDogPluginsParams);
		String demoJson = template.getParamsJsonData();
		System.out.println(demoJson);
	}
	
}

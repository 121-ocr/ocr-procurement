package ocr.procurement;

import java.util.ArrayList;
import java.util.List;

import otocloud.framework.app.engine.AppServiceImpl;
import otocloud.framework.app.engine.WebServer;
import otocloud.framework.app.function.AppActivity;
import otocloud.framework.app.function.AppInitActivityImpl;

/**
 * TODO: 采购管理微服务
 * @date 2016年11月26日
 * @author lijing@yonyou.com
 */
public class ProcurementService extends AppServiceImpl
{

	//创建服务初始化组件
	@Override
	public AppInitActivityImpl createAppInitActivity() {		
		return null;
	}

	//创建租户级web server
	@Override
	public WebServer createWebServer() {
		// TODO Auto-generated method stub
		return null;
	}

	//创建服务内的业务活动组件
	@Override
	public List<AppActivity> createBizActivities() {
		List<AppActivity> retActivities = new ArrayList<>();
		
	
/*		ChannelRestockingComponent channelRestockingComponent = new ChannelRestockingComponent();
		retActivities.add(channelRestockingComponent);
*/
		return retActivities;
	}
}

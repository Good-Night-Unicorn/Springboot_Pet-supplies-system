import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
	import discusstongzhigonggao from '@/views/modules/discusstongzhigonggao/list'
	import yonghu from '@/views/modules/yonghu/list'
	import shangpinfenlei from '@/views/modules/shangpinfenlei/list'
	import chat from '@/views/modules/chat/list'
	import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
	import messages from '@/views/modules/messages/list'
	import chongwushangpin from '@/views/modules/chongwushangpin/list'
	import shouhoufuwu from '@/views/modules/shouhoufuwu/list'
	import orders from '@/views/modules/orders/list'
	import discusschongwushangpin from '@/views/modules/discusschongwushangpin/list'
	import config from '@/views/modules/config/list'
	import shangjia from '@/views/modules/shangjia/list'


//2.配置路由   注意：名字
export const routes = [{
	path: '/',
	name: '系统首页',
	component: Index,
	children: [{
		// 这里不设置值，是把main作为默认页面
		path: '/',
		name: '系统首页',
		component: Home,
		meta: {icon:'', title:'center', affix: true}
	}, {
		path: '/updatePassword',
		name: '修改密码',
		component: UpdatePassword,
		meta: {icon:'', title:'updatePassword'}
	}, {
		path: '/pay',
		name: '支付',
		component: pay,
		meta: {icon:'', title:'pay'}
	}, {
		path: '/center',
		name: '个人信息',
		component: center,
		meta: {icon:'', title:'center'}
	}
	,{
		path: '/discusstongzhigonggao',
		name: '通知公告评论',
		component: discusstongzhigonggao
	}
	,{
		path: '/yonghu',
		name: '用户',
		component: yonghu
	}
	,{
		path: '/shangpinfenlei',
		name: '商品分类',
		component: shangpinfenlei
	}
	,{
		path: '/chat',
		name: '在线客服',
		component: chat
	}
	,{
		path: '/tongzhigonggao',
		name: '通知公告',
		component: tongzhigonggao
	}
	,{
		path: '/messages',
		name: '留言投诉',
		component: messages
	}
	,{
		path: '/chongwushangpin',
		name: '宠物商品',
		component: chongwushangpin
	}
	,{
		path: '/shouhoufuwu',
		name: '售后服务',
		component: shouhoufuwu
	}
	,{
		path: '/orders/:status',
		name: '订单管理',
		component: orders
	}
	,{
		path: '/discusschongwushangpin',
		name: '宠物商品评论',
		component: discusschongwushangpin
	}
	,{
		path: '/config',
		name: '轮播图管理',
		component: config
	}
	,{
		path: '/shangjia',
		name: '商家',
		component: shangjia
	}
	]
	},
	{
		path: '/login',
		name: 'login',
		component: Login,
		meta: {icon:'', title:'login'}
	},
	{
		path: '/register',
		name: 'register',
		component: register,
		meta: {icon:'', title:'register'}
	},
	{
		path: '*',
		component: NotFound
	}
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
	mode: 'hash',
	/*hash模式改为history*/
	routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}
export default router;

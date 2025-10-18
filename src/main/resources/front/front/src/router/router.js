import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Storeup from '../pages/storeup/list'
import AddrList from '../pages/shop-address/list'
import AddrAdd from '../pages/shop-address/addOrUpdate'
import Order from '../pages/shop-order/list'
import OrderConfirm from '../pages/shop-order/confirm'
import Cart from '../pages/shop-cart/list'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import shangjiaList from '../pages/shangjia/list'
import shangjiaDetail from '../pages/shangjia/detail'
import shangjiaAdd from '../pages/shangjia/add'
import shangpinfenleiList from '../pages/shangpinfenlei/list'
import shangpinfenleiDetail from '../pages/shangpinfenlei/detail'
import shangpinfenleiAdd from '../pages/shangpinfenlei/add'
import chongwushangpinList from '../pages/chongwushangpin/list'
import chongwushangpinDetail from '../pages/chongwushangpin/detail'
import chongwushangpinAdd from '../pages/chongwushangpin/add'
import shouhoufuwuList from '../pages/shouhoufuwu/list'
import shouhoufuwuDetail from '../pages/shouhoufuwu/detail'
import shouhoufuwuAdd from '../pages/shouhoufuwu/add'
import tongzhigonggaoList from '../pages/tongzhigonggao/list'
import tongzhigonggaoDetail from '../pages/tongzhigonggao/detail'
import tongzhigonggaoAdd from '../pages/tongzhigonggao/add'
import chargerecordList from '../pages/chargerecord/list'
import chargerecordDetail from '../pages/chargerecord/detail'
import chargerecordAdd from '../pages/chargerecord/add'
import discusschongwushangpinList from '../pages/discusschongwushangpin/list'
import discusschongwushangpinDetail from '../pages/discusschongwushangpin/detail'
import discusschongwushangpinAdd from '../pages/discusschongwushangpin/add'
import discusstongzhigonggaoList from '../pages/discusstongzhigonggao/list'
import discusstongzhigonggaoDetail from '../pages/discusstongzhigonggao/detail'
import discusstongzhigonggaoAdd from '../pages/discusstongzhigonggao/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'storeup',
					component: Storeup
				},
                {
                    path: 'shop-address/list',
                    component: AddrList
                },
                {
                    path: 'shop-address/addOrUpdate',
                    component: AddrAdd
                },
				{
					path: 'shop-order/order',
					component: Order
				},
				{
					path: 'cart',
					component: Cart
				},
				{
					path: 'shop-order/orderConfirm',
					component: OrderConfirm
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'shangjia',
					component: shangjiaList
				},
				{
					path: 'shangjiaDetail',
					component: shangjiaDetail
				},
				{
					path: 'shangjiaAdd',
					component: shangjiaAdd
				},
				{
					path: 'shangpinfenlei',
					component: shangpinfenleiList
				},
				{
					path: 'shangpinfenleiDetail',
					component: shangpinfenleiDetail
				},
				{
					path: 'shangpinfenleiAdd',
					component: shangpinfenleiAdd
				},
				{
					path: 'chongwushangpin',
					component: chongwushangpinList
				},
				{
					path: 'chongwushangpinDetail',
					component: chongwushangpinDetail
				},
				{
					path: 'chongwushangpinAdd',
					component: chongwushangpinAdd
				},
				{
					path: 'shouhoufuwu',
					component: shouhoufuwuList
				},
				{
					path: 'shouhoufuwuDetail',
					component: shouhoufuwuDetail
				},
				{
					path: 'shouhoufuwuAdd',
					component: shouhoufuwuAdd
				},
				{
					path: 'tongzhigonggao',
					component: tongzhigonggaoList
				},
				{
					path: 'tongzhigonggaoDetail',
					component: tongzhigonggaoDetail
				},
				{
					path: 'tongzhigonggaoAdd',
					component: tongzhigonggaoAdd
				},
				{
					path: 'chargerecord',
					component: chargerecordList
				},
				{
					path: 'chargerecordDetail',
					component: chargerecordDetail
				},
				{
					path: 'chargerecordAdd',
					component: chargerecordAdd
				},
				{
					path: 'discusschongwushangpin',
					component: discusschongwushangpinList
				},
				{
					path: 'discusschongwushangpinDetail',
					component: discusschongwushangpinDetail
				},
				{
					path: 'discusschongwushangpinAdd',
					component: discusschongwushangpinAdd
				},
				{
					path: 'discusstongzhigonggao',
					component: discusstongzhigonggaoList
				},
				{
					path: 'discusstongzhigonggaoDetail',
					component: discusstongzhigonggaoDetail
				},
				{
					path: 'discusstongzhigonggaoAdd',
					component: discusstongzhigonggaoAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})

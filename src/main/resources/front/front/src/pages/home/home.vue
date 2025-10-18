<template>
	<div class="home-preview">




		<!-- 商品推荐 -->
		<div id="animate_recommendchongwushangpin" class="recommend animate__animated">
			<div class="recommend_title_box">
				<span class="recommend_title">宠物商品推荐</span>
				<span class="recommend_subhead">{{'chongwushangpin'.toUpperCase()}} RECOMMEND</span>
			</div>
			<div v-if="chongwushangpinRecommend.length" class="list list16 index-pv1">
				<div v-for="item,index in chongwushangpinRecommend" :key="index"  @click="toDetail('chongwushangpinDetail', item)" class="list-item animation-box">
					<div class="img">
						<img v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
						<img v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
					</div>
					<div class="infoBox">
						<div class="info-left">
							<div class="name">{{item.shangpinmingcheng}}</div>
							<div class="price">￥{{item.price}}</div>
							<div class="time_item">
								<span class="icon iconfont icon-shijian21"></span>
								<span class="label">发布时间：</span>
								<span class="text">{{item.addtime.split(' ')[0]}}</span>
							</div>
							<div class="publisher_item">
								<span class="icon iconfont icon-geren16"></span>
								<span class="label">发布人：</span>
								<span class="text">{{item.shangjiahao}}</span>
							</div>
							<div class="collect_item">
								<span class="icon iconfont icon-shoucang10"></span>
								<span class="label">收藏：</span>
								<span class="text">{{item.storeupnum}}</span>
							</div>
						</div>
						<div class="desc" v-html="item.shangpinjieshao"></div>
					</div>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('chongwushangpin')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
		</div>
		<!-- 商品推荐 -->
		<!-- 特价商品 -->
		<div id="animate_listchongwushangpin" class="lists animate__animated">
			<div class="list_title_box">
				<span class="list_title">宠物商品展示</span>
				<span class="list_subhead">{{'chongwushangpin'.toUpperCase()}} SHOW</span>
			</div>
			<div class="list list15 index-pv1">
				<div class="list-body-left">
					<template v-if="chongwushangpinList.length">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 0" @click="toDetail('chongwushangpinDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
					<template v-if="chongwushangpinList.length > 1">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 1" @click="toDetail('chongwushangpinDetail', item)" class="box2 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
				<div class="list-body-center">
					<template v-if="chongwushangpinList.length > 2">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 2" @click="toDetail('chongwushangpinDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
					<div class="box2">
						<div class="name">{{chongwushangpinList[2].shangpinmingcheng}}</div>
						<div class="price">￥{{chongwushangpinList[2].price}}</div>
						<div class="desc" v-html="chongwushangpinList[2].shangpinjieshao"></div>
					</div>
					<template v-if="chongwushangpinList.length > 3">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 3" @click="toDetail('chongwushangpinDetail', item)" class="box3 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
				<div class="list-body-right">
					<template v-if="chongwushangpinList.length > 4">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 4" @click="toDetail('chongwushangpinDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
					<template v-if="chongwushangpinList.length > 5">
						<template v-for="item,index in chongwushangpinList">
							<div v-if="index == 5" @click="toDetail('chongwushangpinDetail', item)" class="box2 list-item">
								<img :name="item.id" v-if="preHttp(item.shangpintupian)" :src="item.shangpintupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.shangpinmingcheng}}</div>
									<div class="price">￥{{item.price}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('chongwushangpin')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
	

		</div>
		<!-- 特价商品 -->
		<!-- 特价商品 -->
		<div id="animate_listtongzhigonggao" class="lists animate__animated">
			<div class="list_title_box">
				<span class="list_title">通知公告展示</span>
				<span class="list_subhead">{{'tongzhigonggao'.toUpperCase()}} SHOW</span>
			</div>
			<div class="list list15 index-pv1">
				<div class="list-body-left">
					<template v-if="tongzhigonggaoList.length">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 0" @click="toDetail('tongzhigonggaoDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
					<template v-if="tongzhigonggaoList.length > 1">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 1" @click="toDetail('tongzhigonggaoDetail', item)" class="box2 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
				<div class="list-body-center">
					<template v-if="tongzhigonggaoList.length > 2">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 2" @click="toDetail('tongzhigonggaoDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
					<div class="box2">
						<div class="name">{{tongzhigonggaoList[2].gonggaobiaoti}}</div>
						<div class="desc" v-html="tongzhigonggaoList[2].neirong"></div>
					</div>
					<template v-if="tongzhigonggaoList.length > 3">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 3" @click="toDetail('tongzhigonggaoDetail', item)" class="box3 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
				<div class="list-body-right">
					<template v-if="tongzhigonggaoList.length > 4">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 4" @click="toDetail('tongzhigonggaoDetail', item)" class="box1 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
					<template v-if="tongzhigonggaoList.length > 5">
						<template v-for="item,index in tongzhigonggaoList">
							<div v-if="index == 5" @click="toDetail('tongzhigonggaoDetail', item)" class="box2 list-item">
								<img :name="item.id" v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
								<img :name="item.id" v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
								<div class="infoBox">
									<div class="name">{{item.gonggaobiaoti}}</div>
								</div>
							</div>
						</template>
					</template>
				</div>
			</div>
			<div class="moreBtn" @click="moreBtn('tongzhigonggao')">
				<span class="text">查看更多</span>
				<i class="icon iconfont icon-gengduo1"></i>
			</div>
	

		</div>
		<!-- 特价商品 -->
	</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

	export default {
		//数据集合
		data() {
			return {
				baseUrl: '',
				newsList: [],
				chongwushangpinRecommend: [],

				chongwushangpinList: [],
				tongzhigonggaoList: [],




			}
		},
		created() {
			this.baseUrl = this.$config.baseUrl;
			this.getList();
		},
		mounted() {
			window.addEventListener('scroll', this.handleScroll)
			setTimeout(()=>{
				this.handleScroll()
			},100)
			
			this.swiperChanges()
		},
		beforeDestroy() {
			window.removeEventListener('scroll', this.handleScroll)
		},
		//方法集合
		methods: {
			newsTabClick11(index){
				this.newsIndex11 = index
			},
			swiperChanges() {
				setTimeout(()=>{
				},750)
			},


			handleScroll() {
				let arr = [
					{id:'about',css:'animate__'},
					{id:'system',css:'animate__'},
					{id:'animate_recommendchongwushangpin',css:'animate__'},
					{id:'animate_listchongwushangpin',css:'animate__'},
					{id:'animate_listtongzhigonggao',css:'animate__'},
				]
			
				for (let i in arr) {
					let doc = document.getElementById(arr[i].id)
					if (doc) {
						let top = doc.offsetTop
						let win_top = window.innerHeight + window.pageYOffset
						// console.log(top,win_top)
						if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
							// console.log(doc)
							doc.classList.add(arr[i].css)
						}
					}
				}
			},
			preHttp(str) {
				return str && str.substr(0,4)=='http';
			},
			getList() {
				let autoSortUrl = "";
				let data = {}
				autoSortUrl = "chongwushangpin/autoSort";
				if(localStorage.getItem('frontToken')) {
					autoSortUrl = "chongwushangpin/autoSort2";
				}
				data = {
					page: 1,
					limit: 4,
					onshelves: 1,
				}
				this.$http.get(autoSortUrl, {params: data}).then(res => {
					if (res.data.code == 0) {
						this.chongwushangpinRecommend = res.data.data.list;
					}
				});
			
				data = {
					page: 1,
					limit: 7,
				}

				this.$http.get('chongwushangpin/list', {params: data}).then(res => {
					if (res.data.code == 0) {
						this.chongwushangpinList = res.data.data.list;
					}
				});
				data = {
					page: 1,
					limit: 7,
				}
				data['sort'] = 'faburiqi'
				data['order']= 'desc'

				this.$http.get('tongzhigonggao/list', {params: data}).then(res => {
					if (res.data.code == 0) {
						this.tongzhigonggaoList = res.data.data.list;
					}
				});
			},
			toDetail(path, item) {
				this.$router.push({path: '/index/' + path, query: {id: item.id}});
			},
			moreBtn(path) {
				this.$router.push({path: '/index/' + path});
			}
		}
	}
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		margin: 0px auto;
		flex-direction: column;
		background: #fff;
		display: flex;
		width: 100%;
		.recommend {
			padding: 0 calc(50% - 625px);
			margin: 0;
			background: url(http://codegen.caihongy.cn/20241105/de478d9056db48f2b1bb4df58e4742af.webp) no-repeat center;
			width: 100%;
			position: relative;
			order: 2;
			.recommend_title_box {
				padding: 0;
				margin: 40px auto 0;
				background: none;
				width: 100%;
				position: relative;
				text-align: left;
				height: auto;
				.recommend_title {
					padding: 0;
					margin: 0 0 20px 0;
					color: #000000;
					background: none;
					display: inline-block;
					width: auto;
					font-size: 40px;
					line-height: inherit;
					height: auto;
				}
				.recommend_subhead {
					margin: 0 0 10px;
					color: #5DB5B7;
					display: block;
					width: 100%;
					font-size: 30px;
					line-height: 1.5;
					text-align: left;
				}
			}
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
			.list16 {
				padding: 0;
				margin: 0 auto;
				color: #5DB5B7;
				background: none;
				display: flex;
				width: 100%;
				font-size: 14px;
				justify-content: space-between;
				flex-wrap: wrap;
				height: auto;
				.list-item {
					padding: 0;
					margin: 0 0 20px;
					background: none;
					display: flex;
					width: 49%;
					position: relative;
					height: auto;
					.img {
						border: 1px solid #777777;
						padding: 15px;
						overflow: hidden;
						background: none;
						width: 250px;
						height: 200px;
						img {
							object-fit: cover;
							display: block;
							width: 100%;
							height: 100%;
						}
					}
					.infoBox {
						padding: 0 10px;
						overflow: hidden;
						flex: 1;
						display: flex;
						height: auto;
						.info-left {
							padding: 0;
							width: 100%;
							.name {
								padding: 0 10px;
								overflow: hidden;
								color: #000000;
								white-space: nowrap;
								width: 100%;
								font-size: 20px;
								line-height: 30px;
								text-overflow: ellipsis;
							}
							.price {
								padding: 0 10px;
								color: #D00000;
								font-size: 16px;
								line-height: 2;
							}
							.time_item {
								padding: 0 10px;
								display: inline-block;
								.icon {
									margin: 0 2px 0 0;
									display: none;
									line-height: 28px;
								}
								.label {
									line-height: 1.5;
								}
								.text {
									line-height: 1.5;
								}
							}
							.publisher_item {
								padding: 0 10px;
								display: inline-block;
								.icon {
									margin: 0 2px 0 0;
									display: none;
									line-height: 28px;
								}
								.label {
									line-height: 1.5;
								}
								.text {
									line-height: 28px;
								}
							}
							.like_item {
								padding: 0 10px;
								display: inline-block;
								.icon {
									margin: 0 2px 0 0;
									display: none;
									line-height: 28px;
								}
								.label {
									line-height: 1.5;
								}
								.text {
									line-height: 28px;
								}
							}
							.collect_item {
								padding: 0 10px;
								display: inline-block;
								.icon {
									margin: 0 2px 0 0;
									display: none;
									line-height: 28px;
								}
								.label {
									line-height: 1.5;
								}
								.text {
									line-height: 28px;
								}
							}
							.view_item {
								padding: 0 10px;
								display: inline-block;
								.icon {
									margin: 0 2px 0 0;
									display: none;
									line-height: 28px;
								}
								.label {
									line-height: 1.5;
								}
								.text {
									line-height: 28px;
								}
							}
						}
						.desc {
							color: #666;
							flex: 1;
							display: none;
							font-size: 14px;
							line-height: 1.5;
						}
					}
				}
				.list-item:hover {
					cursor: pointer;
					background: #F4FFFF;
					.infoBox {
						.info-left {
							.name {
							}
							.price {
							}
							.time_item {
								.icon {
								}
								.label {
								}
								.text {
								}
							}
							.publisher_item {
								.icon {
								}
								.label {
								}
								.text {
								}
							}
							.like_item {
								.icon {
									color: #fff;
								}
								.label {
								}
								.text {
								}
							}
							.collect_item {
								.icon {
								}
								.label {
								}
								.text {
								}
							}
							.view_item {
								.icon {
								}
								.label {
								}
								.text {
								}
							}
						}
						.desc {
							color: #fff;
						}
					}
				}
			}
			.moreBtn {
				border: 0;
				cursor: pointer;
				margin: 80px 0 0;
				top: 0;
				background: none;
				display: block;
				width: auto;
				line-height: 32px;
				position: absolute;
				right: calc(50% - 625px);
				border-bottom: 2px solid #5DB5B7;
				text-align: center;
				.text {
					color: #9E9E9E;
					font-size: 15px;
				}
				.icon {
					color: #333;
					display: none;
					font-size: 15px;
				}
			}
		}
		.lists {
			padding: 30px calc(50% - 625px);
			margin: 0;
			background: #fff;
			width: 100%;
			position: relative;
			order: 4;
			.list_title_box {
				padding: 0;
				margin: 0;
				background: none;
				width: 100%;
				position: relative;
				text-align: left;
				height: auto;
				.list_title {
					padding: 0;
					margin: 0 0 20px 0;
					color: #000000;
					background: none;
					display: inline-block;
					width: auto;
					font-size: 40px;
					line-height: inherit;
					height: auto;
				}
				.list_subhead {
					margin: 0 0 10px;
					color: #5DB5B7;
					display: block;
					width: 100%;
					font-size: 30px;
					line-height: 1.5;
					text-align: left;
				}
			}
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, -10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
			.list15 {
				padding: 0;
				margin: 0 auto;
				display: flex;
				width: 1200px;
				justify-content: center;
				align-items: center;
				height: auto;
				.list-body-left {
					width: 32%;
					height: auto;
					.box1 {
						border: 0px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box1:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
					.box2 {
						border: 1px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box2:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
				}
				.list-body-center {
					margin: 0 2%;
					width: 32%;
					height: auto;
					.box1 {
						border: 1px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box1:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
					.box2 {
						cursor: pointer;
						margin: 10px 0;
						flex-direction: column;
						background: #5DB5B7;
						display: flex;
						width: 100%;
						justify-content: center;
						align-items: center;
						height: 180px;
						.name {
							overflow: hidden;
							color: #fff;
							white-space: nowrap;
							width: 100%;
							font-size: 16px;
							line-height: 30px;
							text-overflow: ellipsis;
							text-align: center;
						}
						.price {
							padding: 0 10px;
							color: #fff;
							font-size: 16px;
							line-height: 1.5;
						}
					}
					.box3 {
						border: 1px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box3:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
				}
				.list-body-right {
					width: 32%;
					height: auto;
					.box1 {
						border: 1px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box1:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
					.box2 {
						border: 1px solid transparent;
						cursor: pointer;
						margin: 10px 0;
						overflow: hidden;
						background: #fff;
						width: 100%;
						position: relative;
						transition: all .3s;
						height: auto;
						img {
							object-fit: cover;
							display: block;
							width: 100% ;
							transition: all .3s;
							height: 180px;
						}
						.infoBox {
							flex-direction: column;
							left: 0;
							background: rgba(0,0,0,.3);
							bottom: 0;
							display: flex;
							width: 100%;
							justify-content: center;
							align-items: center;
							position: absolute;
							opacity: 0;
							transition: all .3s;
							height: 100%;
							.name {
								overflow: hidden;
								color: #fff;
								white-space: nowrap;
								width: 100%;
								font-size: 16px;
								line-height: 30px;
								text-overflow: ellipsis;
								text-align: center;
							}
							.price {
								padding: 0 10px;
								color: #f00;
								font-size: 16px;
								line-height: 1.5;
							}
						}
					}
					.box2:hover {
						border: 1px solid #ff0;
						img {
							transform: scale(1.2);
						}
						.infoBox {
							opacity: 1;
						}
					}
				}
			}
			.moreBtn {
				border: 0;
				cursor: pointer;
				margin: 80px 0 0;
				top: 0;
				background: none;
				display: block;
				width: auto;
				line-height: 32px;
				position: absolute;
				right: calc(50% - 625px);
				border-bottom: 2px solid #5DB5B7;
				text-align: center;
				.text {
					color: #9E9E9E;
					font-size: 15px;
				}
				.icon {
					color: #333;
					display: none;
					font-size: 15px;
				}
			}
		}
	}
</style>

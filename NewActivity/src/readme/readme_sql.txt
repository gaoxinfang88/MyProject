
tb_userinfo		用户信息

	列名		描述		是否用户输入（+用户输入-系统生成）
	uid		用户编号		-
	authority	权限		-
	sex		性别		+
	height		身高		+
	weight		体重		+
	age		年龄		+
	phonenumber	电话号码		+
	email		邮箱		+


tb_activity		活动信息

	id		活动编号		-
	title		活动标题		+
	description	活动描述		+
	starttime	开始时间		+
	endtime		结束时间		+
	createtime	创建时间		-
	manager		管理员id		-
	grade		评分		-
	web_address	web端地址	-
	mobile_address	手机端地址	-
	

tb_participation	参与信息		-
	
	id		参与编号	
	uid		用户编号
	aid		活动编号
	groupid		组编号


tb_comment		评论		
	
	id		评论编号		-
	uid		用户编号		-
	aid		活动编号		-
	createtime	评论时间		-
	content		评论内容		+

tb_image		图片		-

	id		图片编号	
	address		图片地址	


tb_vote			投票		-
	id		投票编号
	title		标题或描述
	type		投标类别

tb_vote_item		投票备选栏	-
	
	id		备选栏id
	voteid		所属投票
	title		标题
	otherid		外链接id

tb_vote_detail		投票明细		-
	id		明细id
	uid		投票用户id
	itemid		所投备选栏id	

	

	

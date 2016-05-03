package com.tomtop.msite.entitys.pgsql.product;

import java.io.Serializable;
import java.util.Date;

public class ProductBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer iid;
	
	private String clistingid;

	private Integer iwebsiteid;

	private Integer ilanguageid;

	private String csku;

	private Integer istatus;

	private Date dnewformdate;

	private Date dnewtodate;

	private Boolean bspecial;

	private String cvideoaddress;

	private Integer iqty;

	private Double fprice;

	private Double fcostprice;

	private Double fweight;

	private String ctitle;

	private String cdescription;

	private String cshortdescription;

	private String ckeyword;

	private String cmetatitle;

	private String cmetakeyword;

	private String cmetadescription;

	private String cpaymentexplain;

	private String creturnexplain;

	private String cwarrantyexplain;

	private String ctitle_default;

	private String cdescription_default;

	private String cshortdescription_default;

	private String ckeyword_default;

	private String cmetatitle_default;

	private String cmetakeyword_default;

	private String cmetadescription_default;

	private Boolean bmultiattribute;

	private String cparentsku;

	private Boolean bvisible;

	private Boolean bpulish;

	private String ccreateuser;

	private Date dcreatedate;

	private double ffreight;

	private Boolean bmain;

	private Boolean bactivity;

	private Double saleprice;
	private Double tariff;
	private Double carriage;
	private String productType;

	private Double localRefPrice;
	
	private Integer baseNum;
	private Double distprice;//采购价
	
	private Double disProfitRate;  //分销利润率
	private Double reProfitRate;   //零售利润率
	private Double disProfit;     //分销毛利润
	private Double reProfit;      //零售毛利润率
	private Double disVat;        //分销Vat
	private Double reVat;         //零售Vat
	private Double disStockFee;   //分销操作费
	private Double reStockFee;    //零售操作费
	private String disShippingType;    //分销物流方式
	private String reShippingType;     //零售物流方式
	private Double disOtherCost;      //分销其他费用
	private Double reOtherCost;      //零售其他费用
	private Double disTotalCost;     //分销总成本
	private Double reTotalCost;      //零售总成本
	private Double disTransferFee;   //分销转仓费
	private Double reTransferFee;    //零售转仓费
	private Integer batchNumber;     //起批数量
	private double postalRate;      //行邮税率

	private Double tradeFee;				//平台费  
	private double postalFee; 				//行邮税
	private Double importTar;       		//进口关税
	private Double gst;             		//消费税
	private Double totalvat;                // 增值税  
	private Integer packQty;        		//箱规
	private String productEnterprise;   	//生产厂家
	private String  componentContent;    	//成分含量
	private Integer expirationDays;      	//保质期
	private String packageType;    			//包装种类
	private String originCountry;   		//原产地
	private String plugType;        		//规格
	private String interBarCode;     		//国际条码
	private String skuBrand;				//品牌
	
	// added by hanfs 2016-03-09
	private Double listFee;// 登录费
	private Double payFee;// 支付费
	private Double insurance;// 保险费

	private Double dislistFee;//分销登录费
	private Double distradeFee;//分销平台 交易费
	private Double dispayFee;//分销支付费
	private Double dispostalFee;//分销行邮税
	private Double disimportTar;//分销进口关税
	private Double disgst;//分销消费税
	private Double disinsurance;//分销保险费
	private Double distotalvat;//分销增值税 

	public Integer getBaseNum() {
		return baseNum;
	}

	public void setBaseNum(Integer baseNum) {
		this.baseNum = baseNum;
	}

	public Double getLocalRefPrice() {
		return localRefPrice;
	}

	public void setLocalRefPrice(Double localRefPrice) {
		this.localRefPrice = localRefPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	public Double getTariff() {
		return tariff;
	}

	public void setTariff(Double tariff) {
		this.tariff = tariff;
	}

	public Double getCarriage() {
		return carriage;
	}

	public void setCarriage(Double carriage) {
		this.carriage = carriage;
	}

	public String getClistingid() {
		return clistingid;
	}

	public void setClistingid(String clistingid) {
		this.clistingid = clistingid == null ? null : clistingid.trim();
	}

	public Integer getIwebsiteid() {
		return iwebsiteid;
	}

	public void setIwebsiteid(Integer iwebsiteid) {
		this.iwebsiteid = iwebsiteid;
	}

	public Integer getIlanguageid() {
		return ilanguageid;
	}

	public void setIlanguageid(Integer ilanguageid) {
		this.ilanguageid = ilanguageid;
	}

	public String getCsku() {
		return csku;
	}

	public void setCsku(String csku) {
		this.csku = csku == null ? null : csku.trim();
	}

	public Integer getIstatus() {
		return istatus;
	}

	public void setIstatus(Integer istatus) {
		this.istatus = istatus;
	}

	public Date getDnewformdate() {
		return dnewformdate;
	}

	public void setDnewformdate(Date dnewformdate) {
		this.dnewformdate = dnewformdate;
	}

	public Date getDnewtodate() {
		return dnewtodate;
	}

	public void setDnewtodate(Date dnewtodate) {
		this.dnewtodate = dnewtodate;
	}

	public Boolean getBspecial() {
		return bspecial;
	}

	public void setBspecial(Boolean ispecial) {
		this.bspecial = ispecial;
	}

	public String getCvideoaddress() {
		return cvideoaddress;
	}

	public void setCvideoaddress(String cvideoaddress) {
		this.cvideoaddress = cvideoaddress == null ? null : cvideoaddress
				.trim();
	}

	public Integer getIqty() {
		return iqty;
	}

	public void setIqty(Integer iqty) {
		this.iqty = iqty;
	}

	public Double getFprice() {
		return fprice;
	}

	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}

	public Double getFcostprice() {
		return fcostprice;
	}

	public void setFcostprice(Double fcostprice) {
		this.fcostprice = fcostprice;
	}

	public String getCtitle() {
		return ctitle == null ? ctitle_default : ctitle.trim();
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle == null ? null : ctitle.trim();
	}

	public String getCdescription() {
		return cdescription == null ? cdescription_default : cdescription
				.trim();
	}

	public void setCdescription(String cdescription) {
		this.cdescription = cdescription == null ? null : cdescription.trim();
	}

	public String getCshortdescription() {
		return cshortdescription == null ? cshortdescription_default
				: cshortdescription.trim();
	}

	public void setCshortdescription(String cshortdescription) {
		this.cshortdescription = cshortdescription == null ? null
				: cshortdescription.trim();
	}

	public String getCkeyword() {
		return ckeyword == null ? ckeyword_default : ckeyword.trim();
	}

	public void setCkeyword(String ckeyword) {
		this.ckeyword = ckeyword == null ? null : ckeyword.trim();
	}

	public String getCmetatitle() {
		return cmetatitle == null ? cmetatitle_default : cmetatitle.trim();
	}

	public void setCmetatitle(String cmetatitle) {
		this.cmetatitle = cmetatitle == null ? "" : cmetatitle.trim();
	}

	public String getCmetakeyword() {
		return cmetakeyword == null ? cmetakeyword_default : cmetakeyword
				.trim();
	}

	public void setCmetakeyword(String cmetakeyword) {
		this.cmetakeyword = cmetakeyword == null ? "" : cmetakeyword.trim();
	}

	public String getCmetadescription() {
		return cmetadescription == null ? cmetadescription_default
				: cmetadescription.trim();
	}

	public void setCmetadescription(String cmetadescription) {
		this.cmetadescription = cmetadescription == null ? null
				: cmetadescription.trim();
	}

	public String getCpaymentexplain() {
		return cpaymentexplain;
	}

	public void setCpaymentexplain(String cpaymentexplain) {
		this.cpaymentexplain = cpaymentexplain;
	}

	public String getCreturnexplain() {
		return creturnexplain;
	}

	public void setCreturnexplain(String creturnexplain) {
		this.creturnexplain = creturnexplain;
	}

	public String getCwarrantyexplain() {
		return cwarrantyexplain;
	}

	public void setCwarrantyexplain(String cwarrantyexplain) {
		this.cwarrantyexplain = cwarrantyexplain;
	}

	public String getCtitle_default() {
		return ctitle_default;
	}

	public void setCtitle_default(String ctitle_default) {
		this.ctitle_default = ctitle_default;
	}

	public String getCdescription_default() {
		return cdescription_default;
	}

	public void setCdescription_default(String cdescription_default) {
		this.cdescription_default = cdescription_default;
	}

	public String getCshortdescription_default() {
		return cshortdescription_default;
	}

	public void setCshortdescription_default(String cshortdescription_default) {
		this.cshortdescription_default = cshortdescription_default;
	}

	public String getCkeyword_default() {
		return ckeyword_default;
	}

	public void setCkeyword_default(String ckeyword_default) {
		this.ckeyword_default = ckeyword_default;
	}

	public String getCmetatitle_default() {
		return cmetatitle_default == null ? "" : cmetatitle_default.trim();
	}

	public void setCmetatitle_default(String cmetatitle_default) {
		this.cmetatitle_default = cmetatitle_default == null ? ""
				: cmetatitle_default;
	}

	public String getCmetakeyword_default() {
		return cmetakeyword_default;
	}

	public void setCmetakeyword_default(String cmetakeyword_default) {
		this.cmetakeyword_default = cmetakeyword_default;
	}

	public String getCmetadescription_default() {
		return cmetadescription_default;
	}

	public void setCmetadescription_default(String cmetadescription_default) {
		this.cmetadescription_default = cmetadescription_default;
	}

	public Boolean getBmultiattribute() {
		return bmultiattribute;
	}

	public void setBmultiattribute(Boolean bmultiattribute) {
		this.bmultiattribute = bmultiattribute;
	}

	public String getCparentsku() {
		return cparentsku;
	}

	public void setCparentsku(String cparentsku) {
		this.cparentsku = cparentsku == null ? null : cparentsku.trim();
	}

	public Boolean getBvisible() {
		return bvisible;
	}

	public void setBvisible(Boolean bvisible) {
		this.bvisible = bvisible;
	}

	public Boolean getBpulish() {
		return bpulish;
	}

	public void setBpulish(Boolean bpulish) {
		this.bpulish = bpulish;
	}

	public String getCcreateuser() {
		return ccreateuser;
	}

	public void setCcreateuser(String ccreateuser) {
		this.ccreateuser = ccreateuser == null ? null : ccreateuser.trim();
	}

	public Date getDcreatedate() {
		return dcreatedate;
	}

	public void setDcreatedate(Date dcreatedate) {
		this.dcreatedate = dcreatedate;
	}

	public Double getFweight() {
		return fweight;
	}

	public void setFweight(Double fweight) {
		this.fweight = fweight;
	}

	public Double getFfreight() {
		return ffreight;
	}

	public void setFfreight(Double ffreight) {
		this.ffreight = ffreight;
	}

	public Boolean getBmain() {
		return bmain;
	}

	public void setBmain(Boolean bmain) {
		this.bmain = bmain;
	}

	public Boolean getBactivity() {
		return bactivity;
	}

	public void setBactivity(Boolean bactivity) {
		this.bactivity = bactivity;
	}

	public Double getDistprice() {
		return distprice;
	}

	public void setDistprice(Double distprice) {
		this.distprice = distprice;
	}

	public Double getDisProfitRate() {
		return disProfitRate;
	}

	public void setDisProfitRate(Double disProfitRate) {
		this.disProfitRate = disProfitRate;
	}

	public Double getReProfitRate() {
		return reProfitRate;
	}

	public void setReProfitRate(Double reProfitRate) {
		this.reProfitRate = reProfitRate;
	}

	public Double getDisProfit() {
		return disProfit;
	}

	public void setDisProfit(Double disProfit) {
		this.disProfit = disProfit;
	}

	public Double getReProfit() {
		return reProfit;
	}

	public void setReProfit(Double reProfit) {
		this.reProfit = reProfit;
	}

	public Double getDisVat() {
		return disVat;
	}

	public void setDisVat(Double disVat) {
		this.disVat = disVat;
	}

	public Double getReVat() {
		return reVat;
	}

	public void setReVat(Double reVat) {
		this.reVat = reVat;
	}

	public Double getDisStockFee() {
		return disStockFee;
	}

	public void setDisStockFee(Double disStockFee) {
		this.disStockFee = disStockFee;
	}

	public Double getReStockFee() {
		return reStockFee;
	}

	public void setReStockFee(Double reStockFee) {
		this.reStockFee = reStockFee;
	}

	public String getDisShippingType() {
		return disShippingType;
	}

	public void setDisShippingType(String disShippingType) {
		this.disShippingType = disShippingType;
	}

	public String getReShippingType() {
		return reShippingType;
	}

	public void setReShippingType(String reShippingType) {
		this.reShippingType = reShippingType;
	}

	public Double getDisOtherCost() {
		return disOtherCost;
	}

	public void setDisOtherCost(Double disOtherCost) {
		this.disOtherCost = disOtherCost;
	}

	public Double getReOtherCost() {
		return reOtherCost;
	}

	public void setReOtherCost(Double reOtherCost) {
		this.reOtherCost = reOtherCost;
	}

	public Double getDisTotalCost() {
		return disTotalCost;
	}

	public void setDisTotalCost(Double disTotalCost) {
		this.disTotalCost = disTotalCost;
	}

	public Double getReTotalCost() {
		return reTotalCost;
	}

	public void setReTotalCost(Double reTotalCost) {
		this.reTotalCost = reTotalCost;
	}

	public Double getDisTransferFee() {
		return disTransferFee;
	}

	public void setDisTransferFee(Double disTransferFee) {
		this.disTransferFee = disTransferFee;
	}

	public Double getReTransferFee() {
		return reTransferFee;
	}

	public void setReTransferFee(Double reTransferFee) {
		this.reTransferFee = reTransferFee;
	}

	public Integer getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(Integer batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Double getPostalRate() {
		return postalRate;
	}

	public void setPostalRate(Double postalRate) {
		this.postalRate = postalRate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public Double getPostalFee() {
		return postalFee;
	}

	public void setPostalFee(Double postalFee) {
		this.postalFee = postalFee;
	}

	public Double getImportTar() {
		return importTar;
	}

	public void setImportTar(Double importTar) {
		this.importTar = importTar;
	}

	public Double getGst() {
		return gst;
	}

	public void setGst(Double gst) {
		this.gst = gst;
	}

	public Integer getPackQty() {
		return packQty;
	}

	public void setPackQty(Integer packQty) {
		this.packQty = packQty;
	}

	public String getProductEnterprise() {
		return productEnterprise;
	}

	public void setProductEnterprise(String productEnterprise) {
		this.productEnterprise = productEnterprise;
	}

	public String getComponentContent() {
		return componentContent;
	}

	public void setComponentContent(String componentContent) {
		this.componentContent = componentContent;
	}

	public Integer getExpirationDays() {
		return expirationDays;
	}

	public void setExpirationDays(Integer expirationDays) {
		this.expirationDays = expirationDays;
	}

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getPlugType() {
		return plugType;
	}

	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}

	public String getInterBarCode() {
		return interBarCode;
	}

	public void setInterBarCode(String interBarCode) {
		this.interBarCode = interBarCode;
	}

	public Double getListFee() {
		return listFee;
	}

	public void setListFee(Double listFee) {
		this.listFee = listFee;
	}

	public Double getPayFee() {
		return payFee;
	}

	public void setPayFee(Double payFee) {
		this.payFee = payFee;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getTradeFee() {
		return tradeFee;
	}

	public void setTradeFee(Double tradeFee) {
		this.tradeFee = tradeFee;
	}

	public Double getDislistFee() {
		return dislistFee;
	}

	public void setDislistFee(Double dislistFee) {
		this.dislistFee = dislistFee;
	}

	public Double getDistradeFee() {
		return distradeFee;
	}

	public void setDistradeFee(Double distradeFee) {
		this.distradeFee = distradeFee;
	}

	public Double getDispayFee() {
		return dispayFee;
	}

	public void setDispayFee(Double dispayFee) {
		this.dispayFee = dispayFee;
	}

	public Double getDispostalFee() {
		return dispostalFee;
	}

	public void setDispostalFee(Double dispostalFee) {
		this.dispostalFee = dispostalFee;
	}

	public Double getDisimportTar() {
		return disimportTar;
	}

	public void setDisimportTar(Double disimportTar) {
		this.disimportTar = disimportTar;
	}

	public Double getDisgst() {
		return disgst;
	}

	public void setDisgst(Double disgst) {
		this.disgst = disgst;
	}

	public Double getDisinsurance() {
		return disinsurance;
	}

	public void setDisinsurance(Double disinsurance) {
		this.disinsurance = disinsurance;
	}

	public String getSkuBrand() {
		return skuBrand;
	}

	public void setSkuBrand(String skuBrand) {
		this.skuBrand = skuBrand;
	}

	public Double getTotalvat() {
		return totalvat;
	}

	public void setTotalvat(Double totalvat) {
		this.totalvat = totalvat;
	}

	public Double getDistotalvat() {
		return distotalvat;
	}

	public void setDistotalvat(Double distotalvat) {
		this.distotalvat = distotalvat;
	}
}
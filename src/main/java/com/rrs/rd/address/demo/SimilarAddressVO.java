package com.rrs.rd.address.demo;

import com.rrs.rd.address.persist.AddressEntity;
import com.rrs.rd.address.similarity.SimilarDoc;

/**
 * Demo服务进行HTML展示时的VO对象。
 * @author Richie 刘志斌 yudi@sina.com
 * 2016年9月22日
 */
public class SimilarAddressVO extends SimilarDoc {
	private AddressEntity addr;
	
	public SimilarAddressVO(SimilarDoc simiDoc){
		super(simiDoc);
	}
	
	public AddressEntity getAddr(){
		return this.addr;
	}
	public void setAddress(AddressEntity value){
		this.addr = value;
	}
}
package com.mstf.mvc.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static String getInstance(String plainText)
			throws NoSuchAlgorithmException {
		//�ڶ����޸�
		//�ڶ����޸�
		//�ڶ����޸�
		//�ڶ����޸�
		//��dg ���޸�
		// ����һ��MD5���ܼ���ժҪ
		MessageDigest md = MessageDigest.getInstance("MD5");
		// ����md5����
		md.update(plainText.getBytes());
		// digest()���ȷ������md5 hashֵ������ֵΪ8Ϊ�ַ�������Ϊmd5 hashֵ��16λ��hexֵ��ʵ���Ͼ���8λ���ַ�
		// BigInteger������8λ���ַ���ת����16λhexֵ�����ַ�������ʾ���õ��ַ�����ʽ��hashֵ
		return new BigInteger(1, md.digest()).toString(16);
	}
}

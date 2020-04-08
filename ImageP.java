package com.epam.DesignPattern;

public class ImageP implements ProxyImage{
		   private Proxyreal realImage;
		   private String fileName;

		   public ImageP(String fileName){
		      this.fileName = fileName;
		   }

		   @Override
		   public void displayImage() {
		      if(realImage == null){
		         realImage = new Proxyreal(fileName);
		      }
		      realImage.displayImage();
		   }
		}

package com.demo.oops.objectinfo;

public class Specimen implements Cloneable {
	
	//instance variable
		private int sampleId;
		
		private String sampleName;

		public Specimen(int sampleId, String sampleName) {
			super();
			this.sampleId = sampleId;
			this.sampleName = sampleName;
		}

		public int getSampleId() {
			return sampleId;
		}

		public void setSampleId(int sampleId) {
			this.sampleId = sampleId;
		}

		public String getSampleName() {
			return sampleName;
		}

		public void setSampleName(String sampleName) {
			this.sampleName = sampleName;
		}

		@Override
		public String toString() {
			return "Specimen [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
		}
		
		@Override
		 public Object clone() throws CloneNotSupportedException {
			//throw new CloneNotSupportedException();
			return super.clone();
		 }

}

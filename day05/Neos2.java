class Neos2 {
	public static void main(String[] args) {
		int[] studentScoresTroop = new int[]{4,3,2,1};
		int max1 = 0;
		for(int i = 0;i < studentScoresTroop.length;i++) {
			for(int j = 0;j < studentScoresTroop.length;j++) {
				int m = studentScoresTroop[j];
				int n = studentScoresTroop[i];
				if(m >= n) {
					if(m >= max1) {
						max1 = studentScoresTroop[j];
					}
				}
			}
		}
		System.out.println("最高分为：" + max1);
	}
		
}

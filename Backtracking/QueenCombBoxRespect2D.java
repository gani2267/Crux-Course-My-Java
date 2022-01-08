package Backtracking;

public class QueenCombBoxRespect2D {
	
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] bool = new boolean[3][4];
		queenCombBoxRespect2D(bool, 3, 0, "", 0, 0);            //manually variable change
		
		count=0;
		System.out.println(); 
		queenCombBoxRespect2D_Extracall(bool,2,0,"",0,0);       //extra recursive call
	}

	public static void queenCombBoxRespect2D(boolean[][] boxes, int tq, int qpsf, String ans, int i, int j) {

		if (tq == qpsf) {
			count++;
			System.out.println(count + " : "+ ans);
			return;
		}

		if (qpsf > tq) {
			return;
		}
		
		if (j == boxes[0].length) {
			i++;
			j = 0;
		}

		if (i >= boxes.length) {
			return;
		}

//			boxes[i][j]=true;             //not required
		queenCombBoxRespect2D(boxes, tq, qpsf + 1, ans + "b" + i + "" + j +" ", i, j + 1);
//			boxes[i][j]=false;            //not required
		queenCombBoxRespect2D(boxes, tq, qpsf, ans, i, j + 1);

	}
	
	public static void queenCombBoxRespect2D_Extracall(boolean[][] boxes, int tq, int qpsf, String ans, int i, int j) {

		if (tq == qpsf) {
			count++;
			System.out.println(count + " : "+ ans);
			return;
		}

		if (qpsf > tq) {
			return;
		}
		
		if (j == boxes[0].length) {
			queenCombBoxRespect2D_Extracall(boxes,tq,qpsf,ans,i+1,0);
			return ;
		}

		if (i >= boxes.length) {
			return;
		}

//			boxes[i][j]=true;             //not required
		queenCombBoxRespect2D_Extracall(boxes, tq, qpsf + 1, ans + "b" + i + "" + j +" ", i, j + 1);
//			boxes[i][j]=false;            //not required
		queenCombBoxRespect2D_Extracall(boxes, tq, qpsf, ans, i, j + 1);

	}

}

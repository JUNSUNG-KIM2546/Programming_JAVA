package chap02;

import java.util.Scanner;
//而⑦듃濡�+�돩�봽�듃+O �빐�꽌 �엫�룷�듃 遺덈윭�삤湲� 

public class mission9_6 {

	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);		
	// �쐞�옉 媛숈�嫄�
	//Scanner scan;				// Constructor(�깮�꽦�옄)-硫붿냼�뱶,�깮�꽦�쓣 �쐞�븳, �깮�꽦�옄紐�==�겢�젅�뒪紐�, scan- 媛앹껜紐�
	//new Scanner(System.in);	// �븯�굹�쓽 硫붿냼�뱶(�깮�꽦�옄 硫붿냼�뱶), new- �깮�꽦�빐以�, Scanner- �깮�꽦�옄紐�, (System.in)- �몴以��엯�젰�뒪�듃由�(�엯�젰踰꾪띁)
	 							// new媛� �엳�뼱�꽌 怨듦컙�븷�떦(�깮�꽦)媛��뒫
	
	//(10踰� 臾몄젣) �썝�쓽 �젙蹂대�� 諛쏄린 �쐞�빐 �궎蹂대뱶濡쒕��꽣 �썝�쓽 以묒떖�쓣 �굹���궡�뒗 �븳 �젏怨� 諛섏�由꾩쓣 �엯�젰 諛쏅뒗�떎.
	//�몢 媛쒖쓽 �썝�쓣 �엯�젰諛쏄퀬 �몢 �썝�씠 �꽌濡� 寃뱀튂�뒗吏� �뙋�떒�븯�뿬 異쒕젰�븯�씪.
	//Scanner �� if議곌굔,�궛�닠�떇 �궗�슜
	
	System.out.print("泥ル쾲吏� �썝�쓽 以묒떖怨� 諛섏�由꾩쓣 �엯�젰�븯�꽭�슂. : ");
	var X = scan.nextDouble();
	var Y = scan.nextDouble();
	var C = scan.nextDouble();

	double Xp = X+C;
	double Xm = X-C;
	double Yp = Y+C;
	double Ym = Y-C;

	System.out.print("�몢踰덉㎏ �썝�쓽 以묒떖怨� 諛섏�由꾩쓣 �엯�젰�븯�꽭�슂. : ");
	var x = scan.nextDouble();
	var y = scan.nextDouble();
	var c = scan.nextDouble();

	double xp = x+c;
	double xm = x-c;
	double yp = y+c;
	double ym = y-c;


	//int grade = 0;		// String 臾몄옄�뿴		int �젙�닔�삎
	
	// 遺꾧린�쟻 if臾�
	if((Xp>xm) && (Xm<xp) || (Xp>ym) && (Xm<yp))
		{ if((Yp<xm) && (Ym>xp) || (Yp>ym) && (Ym<yp))
			System.out.println("�몢 �썝�� �꽌濡� 寃뱀묩�땲�떎.");
		}
	else
		System.out.println("�몢 �썝�� �꽌濡� 寃뱀튂吏� �븡�뒿�땲�떎.");
	
	
	scan.close();

	}
	
}
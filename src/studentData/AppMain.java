package studentData;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Berapa data mahasiswa yang ingin dimasukkan = ");
		int jmlhMhs = input.nextInt();
		System.out.println("============================================");
		System.out.print("Berapa jumlah Input data Kelas Matakuliah per Mahasiswa = ");
		int jmlhKelas = input.nextInt();
		System.out.println("============================================");
		System.out.println();
		
		Student arrayStudent [] = new Student[jmlhMhs];
		Student arrayLearningPlan[][] = new Student[jmlhMhs][jmlhKelas];		
		
		for(int i = 0; i < arrayStudent.length; i++ ) {
			System.out.println("Masukkan data diri Mahasiswa ke " + (i+1));
			System.out.print("Nama Depan : ");
			String firstName = input.next();
			System.out.print("Nama Belakang : ");
			String lastName = input.next();
			System.out.print("Domsili : ");
			String domisili = input.next();
			System.out.print("NIM : ");
			int cardIdentitas = input.nextInt();
			
			for(int j = 0; j < arrayLearningPlan[i].length; j++ ) {
				System.out.println();
				System.out.println("Masukkan data Kelas ke " + (j+1));
				System.out.print("Nama Mata Kuliah : ");
				String courseName = input.next();
				System.out.print("Nama Dosen : ");
				String lecturer = input.next();
				System.out.print("Jumlah SKS : ");
				int sks = input.nextInt();
				System.out.print("Nama Ruang Kelas : ");
				String room = input.next();
				
				//input data to arrayobject
				arrayLearningPlan[i][j] = new Student(courseName, lecturer, sks, room);
			}
			//input data to arrayobject
			arrayStudent[i] = new Student(firstName, lastName, domisili, cardIdentitas);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Rekap Data Mahasiswa");
		System.out.println("----------------------");
		for(int i = 0; i < arrayStudent.length; i++ ) {
			int jmlhSks = 0;
			for(int j = 0; j < arrayLearningPlan[i].length; j++ ) {
				jmlhSks += arrayLearningPlan[i][j].getSks();
			}
			System.out.println("Data Mahasiswa ke : " + (i+1));
			String fullname = "";
			if(jmlhSks < 144) {
				fullname = arrayStudent[i].getFullname();				
			}else {
				fullname = arrayStudent[i].getFullname() + " S.Kom";
			}
			int cardIdentitas = arrayStudent[i].getCardIdentitas();
			String domisili = arrayStudent[i].getDomisili();
			arrayStudent[i].studentRegistration(fullname, cardIdentitas, domisili);
			System.out.println("Total SKS = " + jmlhSks);
			System.out.println("*******************");
			System.out.println("Data Kelas yang diambil");
			System.out.println("*******************");
			
			for(int j = 0; j < arrayLearningPlan[i].length; j++ ) {
				System.out.println("Kelas ke : " + (j+1));
				String courseName = arrayLearningPlan[i][j].getCourseName();
				String lecturer = arrayLearningPlan[i][j].getLecturer();
				int sks = arrayLearningPlan[i][j].getSks();
				String room = arrayLearningPlan[i][j].getRoom();
				arrayLearningPlan[i][j].learningPlan(courseName, lecturer, sks, room);
				System.out.println("----------------------");
			}
			System.out.println("======================");
		}
		input.close();
	}
}

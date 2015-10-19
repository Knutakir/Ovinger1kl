class Oppgaveoversikt{
	private Student[] studenter;
	private int antStud = 0;

	public Oppgaveoversikt(Student[] studenter, int antStud){
		this.studenter = studenter;
		this.antStud = antStud;
	}

	public int studenterRegistrert(){
		return antStud;
	}

	public int antOppgStudent(Student stud){
		return stud.getAntOppg();
	}

	public void regNyStudent(Student nyStudent){
		antStud++;
		int antStudenterFor = studenter.length + 1;
		Student[] nyTabell = new Student[antStudenterFor];
		nyTabell[studenter.length] = nyStudent;

		for(int i = 0; i < studenter.length; i++){
			nyTabell[i] = studenter[i];
		}

		studenter = new Student[antStudenterFor];
		for(int i = 0; i < antStudenterFor; i++){
			studenter[i] = nyTabell[i];
		}

	}

	public void godkjennOppg(String studentNavn, int antNyeGodkjente){
		for(int i = 0; i < studenter.length; i++){
			if(studenter[i].getNavn().equals(studentNavn)){
				studenter[i].okAntOppg(antNyeGodkjente);
			}
		}
	}

	public String toString(){
		return studenter + " " + antStud;
	}
}
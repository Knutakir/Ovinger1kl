class Oppgaveoversikt{
	private Student[] studenter;
	private int antStud = 0;

	public Oppgaveoversikt(Student[] studenter, int antStud){
		this.studenter = studenter;
		this.antStud = antStud;
	}

	public Student studentVedNavn(String navn){
		for(int i = 0; i < antStud; i++){
			if(studenter[i].getNavn().equals(navn)){
				return studenter[i];
			}
		}
		return new Student("INGEN STUDENT", 0);
	}

	public String studentNavnVedId(int studId){
		return studenter[studId].getNavn();
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

	public String toString(){//burde egentlig printe ut hver enkelt student ved hjelp av en for-loop her. Siden denne metoden bare returnerer referansen til tabellen.
		return studenter + " " + antStud;
	}
}
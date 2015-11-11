import static com.jogamp.opengl.GL2.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;
import com.jogamp.opengl.util.FPSAnimator;

import com.jogamp.opengl.util.gl2.GLUT;

class Grafikken extends GLCanvas implements GLEventListener{

	private GLCanvas canvas;
	private float angle;
	private GLU glu = new GLU();
	private GLUT glut = new GLUT();

	public Grafikken(){
		this.addGLEventListener(this);
	}

	public void init(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		gl.glMatrixMode(GL_PROJECTION);
		gl.glLoadIdentity();
		glu.gluPerspective(120.0, 1.5, 2.0, 20.0);
		gl.glMatrixMode(GL_MODELVIEW);
	}

	public void reshape(GLAutoDrawable glDrawable, int i, int i1, int width, int heigth){}

	public void dispose(GLAutoDrawable d){};

	public void drawGLScene(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -5.0f);

		//gl.glColor3f(0.0f, 1.0f, 0.0f);

		//Oppgave a)
		gl.glColor3f(0.5f, 0.0f, 0.0f);
		gl.glTranslatef(1.0f, 0.0f, 0.0f);
		gl.glBegin(GL_LINE_LOOP);
		int antPunkt = 100;
		double vinkel = 0.0;
		for(int i = 0; i < antPunkt; i++){
			vinkel = 2 * Math.PI * i / antPunkt;
			gl.glVertex2f((float)Math.cos(vinkel), (float)Math.sin(vinkel));
		}
		gl.glEnd();
		gl.glTranslatef(-0.5f, 0.0f, 0.0f);

		//Oppgave b)
		gl.glColor3f(0.0f, 1.0f, 0.0f);
		gl.glTranslatef(0.0f, -5f, 0.0f);
		int antSirkler = 30;
		double vinkelB = 0.0;
		for(int j = 0; j < antSirkler; j++){
			//gl.glPushMatrix();
			vinkelB = 2 * Math.PI * j / antSirkler;
			gl.glTranslatef((float)Math.cos(vinkelB), (float)Math.sin(vinkelB), 0.0f);
			gl.glColor3f((float)Math.sin(vinkelB), (float)Math.cos(vinkelB), (float)Math.tan(vinkelB));
			gl.glBegin(GL_LINE_LOOP);
			int antPunktS = 100;
			double vinkelS = 0.0;
			for(int i = 0; i < antPunktS; i++){
				vinkelS = 2 * Math.PI * i / antPunktS;
				gl.glVertex2f((float)Math.cos(vinkelS), (float)Math.sin(vinkelS));
			}
			//gl.glPopMatrix();
			gl.glEnd();
		}

	}

	public void display(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		drawGLScene(glDrawable);
		gl.glFlush();
	}
}
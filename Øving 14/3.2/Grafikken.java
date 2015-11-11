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
		FPSAnimator animator = new FPSAnimator(this, 60);
		animator.start();
	}

	public void init(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		gl.glMatrixMode(GL_PROJECTION);
		gl.glLoadIdentity();
		glu.gluPerspective(120.0, 1.25, 2.0, 20.0);
		gl.glMatrixMode(GL_MODELVIEW);

		gl.glEnable(GL_DEPTH_TEST);
	}

	public void reshape(GLAutoDrawable glDrawable, int i, int i1, int width, int heigth){}

	public void dispose(GLAutoDrawable d){};

	static final float hjornepunkter[][] = {{-1.0f, -1.0f, -1.0f}, {1.0f, -1.0f, -1.0f}, {1.0f, -1.0f, 1.0f}, {-1.0f, -1.0f, 1.0f}, {-1.0f, 1.0f, -1.0f}, {1.0f, 1.0f, -1.0f}, {1.0f, 1.0f, 1.0f}, {-1.0f, 1.0f, 1.0f}};
	static final float farger[][] = {{0.1f, 0.7f, 0.0f}, {0.0f, 0.3f, 1.0f}, {1.0f, 0.5f, 0.2f}, {0.0f, 0.0f, 1.0f}, {1.0f, 1.0f, 0.0f}, {0.0f, 1.0f, 0.0f}};
	float rotasjonsVinkel = 0.0f;

	//tegner en av de seks flatene til kuben
	public void tegnPolygon(int a, int b, int c, int d, GL2 gl){
		gl.glColor3fv(farger[a], 0);
		gl.glBegin(GL_POLYGON);
		gl.glVertex3fv(hjornepunkter[a], 0);
		gl.glVertex3fv(hjornepunkter[b], 0);
		gl.glVertex3fv(hjornepunkter[c], 0);
		gl.glVertex3fv(hjornepunkter[d], 0);
		gl.glEnd();
	}

	public void tegnKube(GL2 gl){
		//GL2 gl = glDrawable.getGL().getGL2();
		tegnPolygon(0, 1, 2, 3, gl); //Bunn
		tegnPolygon(4, 5, 1, 0, gl); //Front
		tegnPolygon(1, 2, 6, 5, gl); //Høyre
		tegnPolygon(2, 6, 7, 3, gl); //Bak
		tegnPolygon(3, 0, 4, 7, gl); //Venstre
		tegnPolygon(5, 6, 7, 4, gl); //Topp
	}

	public void drawGLScene(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		gl.glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -5.0f);

		gl.glColor3f(0.0f, 1.0f, 0.0f);

		//Oppagve 3.2
		gl.glRotated(rotasjonsVinkel, 0.0f, 1.0f, 0.0f);
		tegnKube(gl);
		rotasjonsVinkel++;
	}

	private void oppdater(){
		if(rotasjonsVinkel == 360){
			rotasjonsVinkel = 0;
		}
	}

	public void display(GLAutoDrawable glDrawable){
		GL2 gl = glDrawable.getGL().getGL2();
		drawGLScene(glDrawable);
		//tegnKube(glDrawable);
		oppdater();
		gl.glFlush();
	}
}
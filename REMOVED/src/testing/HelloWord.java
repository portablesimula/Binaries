// JavaLine 1 ==> SourceLine 2
package simprog;
// Release-Beta-0.3 Compiled at Wed Jan 09 19:48:42 CET 2019
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class HelloWord extends BASICIO$ {
    // SubBlock: BlockKind=SimulaProgram, BlockLevel=1, firstLine=2, lastLine=4, hasLocalClasses=false, System=false
    public int prefixLevel() { return(0); }
    // Declare locals as attributes
    // Normal Constructor
    public HelloWord(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("HelloWord");
        // Declaration Code
        TRACE_BEGIN_DCL$("HelloWord",2);
    } // End of Constructor
    // SimulaProgram Statements
    public RTObject$ STM$() {
        TRACE_BEGIN_STM$("HelloWord",2);
        sysout().outtext(new TXT$("Hello Word!"));
        // JavaLine 22 ==> SourceLine 3
        sysout().outimage();
        TRACE_END_STM$("HelloWord",3);
        EBLK();
        return(null);
    } // End of SimulaProgram Statements
    
    public static void main(String[] args) {
        RT.setRuntimeOptions(args);
        new HelloWord(CTX$).STM$();
    }
    public static PROGINFO$ INFO$=new PROGINFO$("HelloWord.sim","SimulaProgram HelloWord",1,2,22,3,32,4);
}

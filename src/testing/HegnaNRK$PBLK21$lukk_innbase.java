// JavaLine 1 ==> SourceLine 1184
package simprog;
// Simula-Beta-0.3 Compiled at Fri Jan 11 09:42:46 CET 2019
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class HegnaNRK$PBLK21$lukk_innbase extends BASICIO$ {
    // ProcedureDeclaration: BlockKind=Procedure, BlockLevel=2, firstLine=1184, lastLine=1188, hasLocalClasses=false, System=false
    public int prefixLevel() { return(0); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public HegnaNRK$PBLK21$lukk_innbase(RTObject$ SL$) {
        super(SL$);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        TRACE_BEGIN_DCL$("lukk_innbase",1184);
        STM$();
    } // End of Constructor
    // Procedure Statements
    public HegnaNRK$PBLK21$lukk_innbase STM$() {
        TRACE_BEGIN_STM$("lukk_innbase",1184);
        // JavaLine 23 ==> SourceLine 1186
        ((HegnaNRK$PBLK21)(CUR$.SL$)).innbase.close();
        // JavaLine 25 ==> SourceLine 1187
        ((HegnaNRK$PBLK21)(CUR$.SL$)).fil_image=null;
        TRACE_END_STM$("lukk_innbase",1187);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("HegnaNRK.sim","Procedure lukk_innbase",1,1184,23,1186,25,1187,30,1188);
}

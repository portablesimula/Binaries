// JavaLine 1 ==> SourceLine 1259
package simprog;
// Release-Beta-0.3 Compiled at Wed Jan 09 21:20:35 CET 2019
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class HegnaNRK$PBLK21$skriv_utbase extends BASICIO$ {
    // ProcedureDeclaration: BlockKind=Procedure, BlockLevel=2, firstLine=1259, lastLine=1344, hasLocalClasses=false, System=false
    public int prefixLevel() { return(0); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 ==> SourceLine 1262
    OutFile$ inspect$1261$9=null;
    // JavaLine 13 ==> SourceLine 1284
    HegnaNRK$PBLK21$format inspect$1283$10=null;
    // JavaLine 15 ==> SourceLine 1300
    HegnaNRK$PBLK21$post inspect$1299$11=null;
    // Normal Constructor
    public HegnaNRK$PBLK21$skriv_utbase(RTObject$ SL$) {
        super(SL$);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        TRACE_BEGIN_DCL$("skriv_utbase",1300);
        STM$();
    } // End of Constructor
    // Procedure Statements
    public HegnaNRK$PBLK21$skriv_utbase STM$() {
        TRACE_BEGIN_STM$("skriv_utbase",1300);
        // JavaLine 29 ==> SourceLine 1261
        {
            // BEGIN INSPECTION 
            inspect$1261$9=((HegnaNRK$PBLK21)(CUR$.SL$)).utbase;
            if(inspect$1261$9!=null) //INSPECT inspect$1261$9
            // JavaLine 34 ==> SourceLine 1344
            new HegnaNRK$PBLK21$skriv_utbase$SubBlock1262(CUR$).STM$();
        }
        TRACE_END_STM$("skriv_utbase",1340);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("HegnaNRK.sim","Procedure skriv_utbase",1,1259,11,1262,13,1284,15,1300,29,1261,34,1344,40,1344);
}

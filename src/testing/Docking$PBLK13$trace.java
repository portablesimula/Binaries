// JavaLine 1 ==> SourceLine 15
package simprog;
// Release-Beta-0.3 Compiled at Wed Jan 09 21:01:35 CET 2019
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Docking$PBLK13$trace extends BASICIO$ {
    // ProcedureDeclaration: BlockKind=Procedure, BlockLevel=2, firstLine=15, lastLine=17, hasLocalClasses=false, System=false
    public int prefixLevel() { return(0); }
    // Declare parameters as attributes
    public TXT$ p$msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    private int $npar=0; // Number of actual parameters transmitted.
    public Docking$PBLK13$trace setPar(Object param) {
        //Util.BREAK("CALL Docking$PBLK13$trace.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$npar+", staticLink="+SL$);
        try {
            switch($npar++) {
                case 0: p$msg=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Wrong number of parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+$npar+" "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public Docking$PBLK13$trace(RTObject$ SL$)
    { super(SL$); }
    // Normal Constructor
    public Docking$PBLK13$trace(RTObject$ SL$,TXT$ sp$msg) {
        super(SL$);
        // Parameter assignment to locals
        this.p$msg = sp$msg;
        BBLK();
        // Declaration Code
        TRACE_BEGIN_DCL$("trace",15);
        STM$();
    } // End of Constructor
    // Procedure Statements
    public Docking$PBLK13$trace STM$() {
        TRACE_BEGIN_STM$("trace",15);
        // JavaLine 41 ==> SourceLine 16
        if(((Docking$PBLK13)(CUR$.SL$)).verbose) {
            // JavaLine 43 ==> SourceLine 17
            {
                TRACE_BEGIN_STM$("CompoundStatement17",17);
                sysout().outtext(p$msg);
                sysout().outimage();
                TRACE_END_STM$("CompoundStatement17",17);
            }
        }
        TRACE_END_STM$("trace",17);
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("Docking.sim","Procedure trace",1,15,41,16,43,17,54,17);
}

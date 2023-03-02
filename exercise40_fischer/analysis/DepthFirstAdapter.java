/* This file was generated by SableCC (http://www.sablecc.org/). */

package exercise40_fischer.analysis;

import java.util.*;
import exercise40_fischer.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPStart().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStart(AStart node)
    {
        defaultIn(node);
    }

    public void outAStart(AStart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        inAStart(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAStart(node);
    }

    public void inAOneStmt(AOneStmt node)
    {
        defaultIn(node);
    }

    public void outAOneStmt(AOneStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOneStmt(AOneStmt node)
    {
        inAOneStmt(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getFst() != null)
        {
            node.getFst().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        if(node.getSnd() != null)
        {
            node.getSnd().apply(this);
        }
        outAOneStmt(node);
    }

    public void inATwoStmt(ATwoStmt node)
    {
        defaultIn(node);
    }

    public void outATwoStmt(ATwoStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATwoStmt(ATwoStmt node)
    {
        inATwoStmt(node);
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outATwoStmt(node);
    }

    public void inAThreeStmt(AThreeStmt node)
    {
        defaultIn(node);
    }

    public void outAThreeStmt(AThreeStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAThreeStmt(AThreeStmt node)
    {
        inAThreeStmt(node);
        if(node.getOther() != null)
        {
            node.getOther().apply(this);
        }
        outAThreeStmt(node);
    }
}

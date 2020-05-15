package interfaces;

import java.security.PublicKey;

public interface IMessage {

    public boolean isPrimary();
    public void setType(String type);

    public IBlock getBlock();

    public void setBlock(IBlock block);

    public String getMessageType();

    public PublicKey getPrimaryPublicKey();

    public void setPrimaryPublicKey(PublicKey primaryNodeKey);

    public int getSeqNum();

    public void setSeqNum(int seqNum);

    public int getViewNum();

    public void setViewNum(int viewNum);

    public boolean verifyPeerSignature();

    public PublicKey getNodePublicKey();

    public int getNewViewNum();

    public IMessagePool getMessagePool();

//    public byte[] getNodeSignature();
//
//    public void setNodeSignature(byte[] nodeSignature);


}

public class PedidoBuilder  extends PedidoAbstractBuilder{


    private Pedido pedido = new Pedido();

    @Override
    public void setLanche(TipoLanche tipo) {

        ItemPedido item = new ItemPedido();
        item.setNome(tipo.name());
        item.setTipo(TipoItemPedido.LANCHE);

        pedido.adicionarItemDentroCaixa(item);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {

        ItemPedido item = new ItemPedido ();
        item.setNome(tamanho.name());
        item.setTipo(TipoItemPedido.BATATA);

        pedido.adicionarItemDentroCaixa(item);

    }

    @Override
    public void setBrinde(TipoBrinde tipo) {

        ItemPedido item = new ItemPedido ();
        item.setNome(tipo.name());
        item.setTipo(TipoItemPedido.BRINDE);

        pedido.adicionarItemDentroCaixa(item);

    }

    @Override
    public void setBebida(TipoBebida tipo) {

        ItemPedido item = new ItemPedido ();
        item.setNome(tipo.name());
        item.setTipo(TipoItemPedido.BEBIDA);

        pedido.adicionarItemDentroCaixa(item);

    }

    public Pedido build () {

        return pedido;

    }
}

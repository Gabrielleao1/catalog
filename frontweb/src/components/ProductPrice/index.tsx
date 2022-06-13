import { formatPrice } from 'components/utils/formaters';
import './style.css';

type Props = {
    price: number
}

function ProductPrice({ price } : Props) {
    return (
        <div className='product-price-container'>
            <span>R$</span>
            <h3>{formatPrice(price)}</h3>
        </div>
    );
}

export default ProductPrice;
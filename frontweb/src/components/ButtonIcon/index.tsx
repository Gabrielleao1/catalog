import './style.css';
import { ReactComponent as ArrowIcon } from 'assets/images/arrow.svg';

function ButtonIcon() {
    return (
        <>
            <div className='btn-container'>
                <button className="btn btn-primary">
                    <h6>INICIE AGORA SUA BUSCA</h6>
                </button>
                <div className='btn-icon-container'>
                    <ArrowIcon />
                </div>
            </div>
        </>
    );
}

export default ButtonIcon;
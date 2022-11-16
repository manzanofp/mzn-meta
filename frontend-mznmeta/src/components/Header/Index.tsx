import logo from '../../assets/img/logo.svg'
import'./styles.css'


function Header(){
    return(
        <header>
        <div className="mznmeta-logo-container">
            <img src={logo} alt="MZN-Meta" />
            <h1>MZN-Meta</h1>
            <p>
              Desenvolvido por
              <a href="https://github.com/manzanofp"> github.com/manzanofp</a>
            </p>
        </div>
    </header>
    )
}
export default Header
import clsx from 'clsx'
import styles from './Button.module.css'

function Button ({ primary }) {
    return (
            <button className={styles.btn}>
                Click me!
            </button>
    )
}

export default Button
set autoindent
set cindent
set nu
set ts=4
set shiftwidth=4
set laststatus=2
set statusline=\ %<%l:%v\ [%P]%=%a\ %h%m%r\ %F\
set hlsearch
set scrolloff=2
set showmatch
set smarttab
set ruler
set incsearch


if has("syntax")
 syntax on
endif

au BufReadPost *
\ if line("'\"") > 0 && line("'\"") <= line("$") |
\ exe "norm g`\"" |
\ endif


